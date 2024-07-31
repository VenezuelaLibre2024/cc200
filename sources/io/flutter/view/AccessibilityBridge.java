package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.util.Predicate;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class AccessibilityBridge extends AccessibilityNodeProvider {
    private static final int ACTION_SHOW_ON_SCREEN = 16908342;
    private static final int BOLD_TEXT_WEIGHT_ADJUSTMENT = 300;
    private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
    private static final int ROOT_NODE_ID = 0;
    private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0f;
    private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0f;
    private static final String TAG = "AccessibilityBridge";
    private final AccessibilityChannel accessibilityChannel;
    private int accessibilityFeatureFlags;
    private SemanticsNode accessibilityFocusedSemanticsNode;
    private final AccessibilityManager accessibilityManager;
    private final AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler;
    private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
    private final AccessibilityViewEmbedder accessibilityViewEmbedder;
    private boolean accessibleNavigation;
    private final ContentObserver animationScaleObserver;
    private final ContentResolver contentResolver;
    private final Map<Integer, CustomAccessibilityAction> customAccessibilityActions;
    private Integer embeddedAccessibilityFocusedNodeId;
    private Integer embeddedInputFocusedNodeId;
    private final List<Integer> flutterNavigationStack;
    private final Map<Integer, SemanticsNode> flutterSemanticsTree;
    private SemanticsNode hoveredObject;
    private SemanticsNode inputFocusedSemanticsNode;
    private boolean isReleased;
    private SemanticsNode lastInputFocusedSemanticsNode;
    private Integer lastLeftFrameInset;
    private OnAccessibilityChangeListener onAccessibilityChangeListener;
    private final PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
    private int previousRouteId;
    private final View rootAccessibilityView;

    @TargetApi(19)
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
    private static final int SCROLLABLE_ACTIONS = ((Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value) | Action.SCROLL_UP.value) | Action.SCROLL_DOWN.value;
    private static final int FOCUSABLE_FLAGS = ((((((((((Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value) | Flag.IS_SELECTED.value) | Flag.IS_TEXT_FIELD.value) | Flag.IS_FOCUSED.value) | Flag.HAS_ENABLED_STATE.value) | Flag.IS_ENABLED.value) | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | Flag.HAS_TOGGLED_STATE.value) | Flag.IS_TOGGLED.value) | Flag.IS_FOCUSABLE.value) | Flag.IS_SLIDER.value;
    private static int FIRST_RESOURCE_ID = 267386881;
    public static int systemAction = (Action.DID_GAIN_ACCESSIBILITY_FOCUS.value & Action.DID_LOSE_ACCESSIBILITY_FOCUS.value) & Action.SHOW_ON_SCREEN.value;

    /* renamed from: io.flutter.view.AccessibilityBridge$1 */
    /* loaded from: classes2.dex */
    public class C31831 implements AccessibilityChannel.AccessibilityMessageHandler {
        public C31831() {
        }

        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
        public void announce(String str) {
            AccessibilityBridge.this.rootAccessibilityView.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
        public void onFocus(int i10) {
            AccessibilityBridge.this.sendAccessibilityEvent(i10, 8);
        }

        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
        public void onLongPress(int i10) {
            AccessibilityBridge.this.sendAccessibilityEvent(i10, 2);
        }

        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
        public void onTap(int i10) {
            AccessibilityBridge.this.sendAccessibilityEvent(i10, 1);
        }

        @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
        public void onTooltip(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent obtainAccessibilityEvent = AccessibilityBridge.this.obtainAccessibilityEvent(0, 32);
            obtainAccessibilityEvent.getText().add(str);
            AccessibilityBridge.this.sendAccessibilityEvent(obtainAccessibilityEvent);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
        public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            AccessibilityBridge.this.updateCustomAccessibilityActions(byteBuffer, strArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
        public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            AccessibilityBridge.this.updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$2 */
    /* loaded from: classes2.dex */
    public class AccessibilityManagerAccessibilityStateChangeListenerC31842 implements AccessibilityManager.AccessibilityStateChangeListener {
        public AccessibilityManagerAccessibilityStateChangeListenerC31842() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            if (AccessibilityBridge.this.isReleased) {
                return;
            }
            AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
            if (z10) {
                accessibilityBridge.accessibilityChannel.setAccessibilityMessageHandler(AccessibilityBridge.this.accessibilityMessageHandler);
                AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityEnabled();
            } else {
                accessibilityBridge.setAccessibleNavigation(false);
                AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler(null);
                AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityDisabled();
            }
            if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(z10, AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
            }
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$3 */
    /* loaded from: classes2.dex */
    public class C31853 extends ContentObserver {
        public C31853(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            onChange(z10, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            if (AccessibilityBridge.this.isReleased) {
                return;
            }
            String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(AccessibilityBridge.this.contentResolver, "transition_animation_scale");
            if (string != null && string.equals("0")) {
                AccessibilityBridge.access$1176(AccessibilityBridge.this, AccessibilityFeature.DISABLE_ANIMATIONS.value);
            } else {
                AccessibilityBridge.access$1172(AccessibilityBridge.this, ~AccessibilityFeature.DISABLE_ANIMATIONS.value);
            }
            AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$4 */
    /* loaded from: classes2.dex */
    public class AccessibilityManagerTouchExplorationStateChangeListenerC31864 implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final /* synthetic */ AccessibilityManager val$accessibilityManager;

        public AccessibilityManagerTouchExplorationStateChangeListenerC31864(AccessibilityManager accessibilityManager) {
            r2 = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            if (AccessibilityBridge.this.isReleased) {
                return;
            }
            if (!z10) {
                AccessibilityBridge.this.setAccessibleNavigation(false);
                AccessibilityBridge.this.onTouchExplorationExit();
            }
            if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(r2.isEnabled(), z10);
            }
        }
    }

    /* renamed from: io.flutter.view.AccessibilityBridge$5 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C31875 {

        /* renamed from: $SwitchMap$io$flutter$view$AccessibilityBridge$StringAttributeType */
        public static final /* synthetic */ int[] f11021x66a987df;

        static {
            int[] iArr = new int[StringAttributeType.values().length];
            f11021x66a987df = iArr;
            try {
                iArr[StringAttributeType.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11021x66a987df[StringAttributeType.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);

        public final int value;

        AccessibilityFeature(int i10) {
            this.value = i10;
        }
    }

    /* loaded from: classes2.dex */
    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(AccessibilityBridge.MIN_ENGINE_GENERATED_NODE_ID),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);

        public final int value;

        Action(int i10) {
            this.value = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static class CustomAccessibilityAction {
        private String hint;
        private String label;
        private int resourceId = -1;

        /* renamed from: id */
        private int f11022id = -1;
        private int overrideId = -1;
    }

    /* loaded from: classes2.dex */
    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(AccessibilityBridge.MIN_ENGINE_GENERATED_NODE_ID),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728);

        public final int value;

        Flag(int i10) {
            this.value = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static class LocaleStringAttribute extends StringAttribute {
        public String locale;

        private LocaleStringAttribute() {
            super();
        }

        public /* synthetic */ LocaleStringAttribute(C31831 c31831) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface OnAccessibilityChangeListener {
        void onAccessibilityChanged(boolean z10, boolean z11);
    }

    /* loaded from: classes2.dex */
    public static class SemanticsNode {
        public final AccessibilityBridge accessibilityBridge;
        private int actions;
        private float bottom;
        private int currentValueLength;
        private List<CustomAccessibilityAction> customAccessibilityActions;
        private String decreasedValue;
        private List<StringAttribute> decreasedValueAttributes;
        private int flags;
        private Rect globalRect;
        private float[] globalTransform;
        private String hint;
        private List<StringAttribute> hintAttributes;
        private String increasedValue;
        private List<StringAttribute> increasedValueAttributes;
        private float[] inverseTransform;
        private String label;
        private List<StringAttribute> labelAttributes;
        private float left;
        private int maxValueLength;
        private CustomAccessibilityAction onLongPressOverride;
        private CustomAccessibilityAction onTapOverride;
        private SemanticsNode parent;
        private int platformViewId;
        private int previousActions;
        private int previousFlags;
        private String previousLabel;
        private float previousScrollExtentMax;
        private float previousScrollExtentMin;
        private float previousScrollPosition;
        private int previousTextSelectionBase;
        private int previousTextSelectionExtent;
        private String previousValue;
        private float right;
        private int scrollChildren;
        private float scrollExtentMax;
        private float scrollExtentMin;
        private int scrollIndex;
        private float scrollPosition;
        private TextDirection textDirection;
        private int textSelectionBase;
        private int textSelectionExtent;
        private String tooltip;
        private float top;
        private float[] transform;
        private String value;
        private List<StringAttribute> valueAttributes;

        /* renamed from: id */
        private int f11023id = -1;
        private int previousNodeId = -1;
        private boolean hadPreviousConfig = false;
        private List<SemanticsNode> childrenInTraversalOrder = new ArrayList();
        private List<SemanticsNode> childrenInHitTestOrder = new ArrayList();
        private boolean inverseTransformDirty = true;
        private boolean globalGeometryDirty = true;

        public SemanticsNode(AccessibilityBridge accessibilityBridge) {
            this.accessibilityBridge = accessibilityBridge;
        }

        public static /* synthetic */ int access$2112(SemanticsNode semanticsNode, int i10) {
            int i11 = semanticsNode.textSelectionExtent + i10;
            semanticsNode.textSelectionExtent = i11;
            return i11;
        }

        public static /* synthetic */ int access$2120(SemanticsNode semanticsNode, int i10) {
            int i11 = semanticsNode.textSelectionExtent - i10;
            semanticsNode.textSelectionExtent = i11;
            return i11;
        }

        public void collectRoutes(List<SemanticsNode> list) {
            if (hasFlag(Flag.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator<SemanticsNode> it = this.childrenInTraversalOrder.iterator();
            while (it.hasNext()) {
                it.next().collectRoutes(list);
            }
        }

        @TargetApi(21)
        private SpannableString createSpannableString(String str, List<StringAttribute> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (StringAttribute stringAttribute : list) {
                    int i10 = C31875.f11021x66a987df[stringAttribute.type.ordinal()];
                    if (i10 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), stringAttribute.start, stringAttribute.end, 0);
                    } else if (i10 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((LocaleStringAttribute) stringAttribute).locale)), stringAttribute.start, stringAttribute.end, 0);
                    }
                }
            }
            return spannableString;
        }

        public boolean didChangeLabel() {
            String str;
            String str2 = this.label;
            if (str2 == null && this.previousLabel == null) {
                return false;
            }
            return str2 == null || (str = this.previousLabel) == null || !str2.equals(str);
        }

        public boolean didScroll() {
            return (Float.isNaN(this.scrollPosition) || Float.isNaN(this.previousScrollPosition) || this.previousScrollPosition == this.scrollPosition) ? false : true;
        }

        private void ensureInverseTransform() {
            if (this.inverseTransformDirty) {
                this.inverseTransformDirty = false;
                if (this.inverseTransform == null) {
                    this.inverseTransform = new float[16];
                }
                if (Matrix.invertM(this.inverseTransform, 0, this.transform, 0)) {
                    return;
                }
                Arrays.fill(this.inverseTransform, 0.0f);
            }
        }

        private SemanticsNode getAncestor(Predicate<SemanticsNode> predicate) {
            for (SemanticsNode semanticsNode = this.parent; semanticsNode != null; semanticsNode = semanticsNode.parent) {
                if (predicate.test(semanticsNode)) {
                    return semanticsNode;
                }
            }
            return null;
        }

        public Rect getGlobalRect() {
            return this.globalRect;
        }

        private CharSequence getHint() {
            return Build.VERSION.SDK_INT < 21 ? this.hint : createSpannableString(this.hint, this.hintAttributes);
        }

        private CharSequence getLabel() {
            return Build.VERSION.SDK_INT < 21 ? this.label : createSpannableString(this.label, this.labelAttributes);
        }

        public String getRouteName() {
            String str;
            if (hasFlag(Flag.NAMES_ROUTE) && (str = this.label) != null && !str.isEmpty()) {
                return this.label;
            }
            Iterator<SemanticsNode> it = this.childrenInTraversalOrder.iterator();
            while (it.hasNext()) {
                String routeName = it.next().getRouteName();
                if (routeName != null && !routeName.isEmpty()) {
                    return routeName;
                }
            }
            return null;
        }

        private List<StringAttribute> getStringAttributesFromBuffer(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = byteBuffer.getInt();
                int i13 = byteBuffer.getInt();
                StringAttributeType stringAttributeType = StringAttributeType.values()[byteBuffer.getInt()];
                int i14 = C31875.f11021x66a987df[stringAttributeType.ordinal()];
                if (i14 == 1) {
                    byteBuffer.getInt();
                    SpellOutStringAttribute spellOutStringAttribute = new SpellOutStringAttribute();
                    spellOutStringAttribute.start = i12;
                    spellOutStringAttribute.end = i13;
                    spellOutStringAttribute.type = stringAttributeType;
                    arrayList.add(spellOutStringAttribute);
                } else if (i14 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    LocaleStringAttribute localeStringAttribute = new LocaleStringAttribute();
                    localeStringAttribute.start = i12;
                    localeStringAttribute.end = i13;
                    localeStringAttribute.type = stringAttributeType;
                    localeStringAttribute.locale = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(localeStringAttribute);
                }
            }
            return arrayList;
        }

        public CharSequence getTextFieldHint() {
            CharSequence[] charSequenceArr = {getLabel(), getHint()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 2; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        public CharSequence getValue() {
            return Build.VERSION.SDK_INT < 21 ? this.value : createSpannableString(this.value, this.valueAttributes);
        }

        public CharSequence getValueLabelHint() {
            CharSequence[] charSequenceArr = {getValue(), getLabel(), getHint()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 3; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        public boolean hadAction(Action action) {
            return (action.value & this.previousActions) != 0;
        }

        public boolean hadFlag(Flag flag) {
            return (flag.value & this.previousFlags) != 0;
        }

        public boolean hasAction(Action action) {
            return (action.value & this.actions) != 0;
        }

        public boolean hasFlag(Flag flag) {
            return (flag.value & this.flags) != 0;
        }

        public SemanticsNode hitTest(float[] fArr, boolean z10) {
            float f10 = fArr[3];
            boolean z11 = false;
            float f11 = fArr[0] / f10;
            float f12 = fArr[1] / f10;
            if (f11 < this.left || f11 >= this.right || f12 < this.top || f12 >= this.bottom) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (SemanticsNode semanticsNode : this.childrenInHitTestOrder) {
                if (!semanticsNode.hasFlag(Flag.IS_HIDDEN)) {
                    semanticsNode.ensureInverseTransform();
                    Matrix.multiplyMV(fArr2, 0, semanticsNode.inverseTransform, 0, fArr, 0);
                    SemanticsNode hitTest = semanticsNode.hitTest(fArr2, z10);
                    if (hitTest != null) {
                        return hitTest;
                    }
                }
            }
            if (z10 && this.platformViewId != -1) {
                z11 = true;
            }
            if (isFocusable() || z11) {
                return this;
            }
            return null;
        }

        public boolean isFocusable() {
            String str;
            String str2;
            String str3;
            if (hasFlag(Flag.SCOPES_ROUTE)) {
                return false;
            }
            if (hasFlag(Flag.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.actions & (~AccessibilityBridge.SCROLLABLE_ACTIONS)) == 0 && (this.flags & AccessibilityBridge.FOCUSABLE_FLAGS) == 0 && ((str = this.label) == null || str.isEmpty()) && (((str2 = this.value) == null || str2.isEmpty()) && ((str3 = this.hint) == null || str3.isEmpty()))) ? false : true;
        }

        private void log(String str, boolean z10) {
        }

        private float max(float f10, float f11, float f12, float f13) {
            return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
        }

        private float min(float f10, float f11, float f12, float f13) {
            return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
        }

        public static boolean nullableHasAncestor(SemanticsNode semanticsNode, Predicate<SemanticsNode> predicate) {
            return (semanticsNode == null || semanticsNode.getAncestor(predicate) == null) ? false : true;
        }

        private void transformPoint(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f10 = fArr[3];
            fArr[0] = fArr[0] / f10;
            fArr[1] = fArr[1] / f10;
            fArr[2] = fArr[2] / f10;
            fArr[3] = 0.0f;
        }

        public void updateRecursively(float[] fArr, Set<SemanticsNode> set, boolean z10) {
            set.add(this);
            if (this.globalGeometryDirty) {
                z10 = true;
            }
            if (z10) {
                if (this.globalTransform == null) {
                    this.globalTransform = new float[16];
                }
                if (this.transform == null) {
                    this.transform = new float[16];
                }
                Matrix.multiplyMM(this.globalTransform, 0, fArr, 0, this.transform, 0);
                float[] fArr2 = {this.left, this.top, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                transformPoint(fArr3, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.top;
                transformPoint(fArr4, this.globalTransform, fArr2);
                fArr2[0] = this.right;
                fArr2[1] = this.bottom;
                transformPoint(fArr5, this.globalTransform, fArr2);
                fArr2[0] = this.left;
                fArr2[1] = this.bottom;
                transformPoint(fArr6, this.globalTransform, fArr2);
                if (this.globalRect == null) {
                    this.globalRect = new Rect();
                }
                this.globalRect.set(Math.round(min(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(min(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(max(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(max(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.globalGeometryDirty = false;
            }
            int i10 = -1;
            for (SemanticsNode semanticsNode : this.childrenInTraversalOrder) {
                semanticsNode.previousNodeId = i10;
                i10 = semanticsNode.f11023id;
                semanticsNode.updateRecursively(this.globalTransform, set, z10);
            }
        }

        public void updateWith(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.hadPreviousConfig = true;
            this.previousValue = this.value;
            this.previousLabel = this.label;
            this.previousFlags = this.flags;
            this.previousActions = this.actions;
            this.previousTextSelectionBase = this.textSelectionBase;
            this.previousTextSelectionExtent = this.textSelectionExtent;
            this.previousScrollPosition = this.scrollPosition;
            this.previousScrollExtentMax = this.scrollExtentMax;
            this.previousScrollExtentMin = this.scrollExtentMin;
            this.flags = byteBuffer.getInt();
            this.actions = byteBuffer.getInt();
            this.maxValueLength = byteBuffer.getInt();
            this.currentValueLength = byteBuffer.getInt();
            this.textSelectionBase = byteBuffer.getInt();
            this.textSelectionExtent = byteBuffer.getInt();
            this.platformViewId = byteBuffer.getInt();
            this.scrollChildren = byteBuffer.getInt();
            this.scrollIndex = byteBuffer.getInt();
            this.scrollPosition = byteBuffer.getFloat();
            this.scrollExtentMax = byteBuffer.getFloat();
            this.scrollExtentMin = byteBuffer.getFloat();
            int i10 = byteBuffer.getInt();
            this.label = i10 == -1 ? null : strArr[i10];
            this.labelAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            this.value = i11 == -1 ? null : strArr[i11];
            this.valueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.increasedValue = i12 == -1 ? null : strArr[i12];
            this.increasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            this.decreasedValue = i13 == -1 ? null : strArr[i13];
            this.decreasedValueAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            this.hint = i14 == -1 ? null : strArr[i14];
            this.hintAttributes = getStringAttributesFromBuffer(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            this.tooltip = i15 == -1 ? null : strArr[i15];
            this.textDirection = TextDirection.fromInt(byteBuffer.getInt());
            this.left = byteBuffer.getFloat();
            this.top = byteBuffer.getFloat();
            this.right = byteBuffer.getFloat();
            this.bottom = byteBuffer.getFloat();
            if (this.transform == null) {
                this.transform = new float[16];
            }
            for (int i16 = 0; i16 < 16; i16++) {
                this.transform[i16] = byteBuffer.getFloat();
            }
            this.inverseTransformDirty = true;
            this.globalGeometryDirty = true;
            int i17 = byteBuffer.getInt();
            this.childrenInTraversalOrder.clear();
            this.childrenInHitTestOrder.clear();
            for (int i18 = 0; i18 < i17; i18++) {
                SemanticsNode orCreateSemanticsNode = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode.parent = this;
                this.childrenInTraversalOrder.add(orCreateSemanticsNode);
            }
            for (int i19 = 0; i19 < i17; i19++) {
                SemanticsNode orCreateSemanticsNode2 = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                orCreateSemanticsNode2.parent = this;
                this.childrenInHitTestOrder.add(orCreateSemanticsNode2);
            }
            int i20 = byteBuffer.getInt();
            if (i20 == 0) {
                this.customAccessibilityActions = null;
                return;
            }
            List<CustomAccessibilityAction> list = this.customAccessibilityActions;
            if (list == null) {
                this.customAccessibilityActions = new ArrayList(i20);
            } else {
                list.clear();
            }
            for (int i21 = 0; i21 < i20; i21++) {
                CustomAccessibilityAction orCreateAccessibilityAction = this.accessibilityBridge.getOrCreateAccessibilityAction(byteBuffer.getInt());
                if (orCreateAccessibilityAction.overrideId == Action.TAP.value) {
                    this.onTapOverride = orCreateAccessibilityAction;
                } else if (orCreateAccessibilityAction.overrideId == Action.LONG_PRESS.value) {
                    this.onLongPressOverride = orCreateAccessibilityAction;
                } else {
                    this.customAccessibilityActions.add(orCreateAccessibilityAction);
                }
                this.customAccessibilityActions.add(orCreateAccessibilityAction);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class SpellOutStringAttribute extends StringAttribute {
        private SpellOutStringAttribute() {
            super();
        }

        public /* synthetic */ SpellOutStringAttribute(C31831 c31831) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static class StringAttribute {
        public int end;
        public int start;
        public StringAttributeType type;

        private StringAttribute() {
        }

        public /* synthetic */ StringAttribute(C31831 c31831) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public enum StringAttributeType {
        SPELLOUT,
        LOCALE
    }

    /* loaded from: classes2.dex */
    public enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        public static TextDirection fromInt(int i10) {
            return i10 != 1 ? i10 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel, AccessibilityManager accessibilityManager, ContentResolver contentResolver, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        this(view, accessibilityChannel, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, MIN_ENGINE_GENERATED_NODE_ID), platformViewsAccessibilityDelegate);
    }

    public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        this.flutterSemanticsTree = new HashMap();
        this.customAccessibilityActions = new HashMap();
        this.accessibilityFeatureFlags = 0;
        this.flutterNavigationStack = new ArrayList();
        this.previousRouteId = 0;
        this.lastLeftFrameInset = 0;
        this.accessibleNavigation = false;
        this.isReleased = false;
        this.accessibilityMessageHandler = new AccessibilityChannel.AccessibilityMessageHandler() { // from class: io.flutter.view.AccessibilityBridge.1
            public C31831() {
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void announce(String str) {
                AccessibilityBridge.this.rootAccessibilityView.announceForAccessibility(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onFocus(int i10) {
                AccessibilityBridge.this.sendAccessibilityEvent(i10, 8);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onLongPress(int i10) {
                AccessibilityBridge.this.sendAccessibilityEvent(i10, 2);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onTap(int i10) {
                AccessibilityBridge.this.sendAccessibilityEvent(i10, 1);
            }

            @Override // io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
            public void onTooltip(String str) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                AccessibilityEvent obtainAccessibilityEvent = AccessibilityBridge.this.obtainAccessibilityEvent(0, 32);
                obtainAccessibilityEvent.getText().add(str);
                AccessibilityBridge.this.sendAccessibilityEvent(obtainAccessibilityEvent);
            }

            @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                AccessibilityBridge.this.updateCustomAccessibilityActions(byteBuffer, strArr);
            }

            @Override // io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate
            public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                for (ByteBuffer byteBuffer2 : byteBufferArr) {
                    byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
                }
                AccessibilityBridge.this.updateSemantics(byteBuffer, strArr, byteBufferArr);
            }
        };
        AccessibilityManagerAccessibilityStateChangeListenerC31842 accessibilityManagerAccessibilityStateChangeListenerC31842 = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.2
            public AccessibilityManagerAccessibilityStateChangeListenerC31842() {
            }

            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public void onAccessibilityStateChanged(boolean z10) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
                if (z10) {
                    accessibilityBridge.accessibilityChannel.setAccessibilityMessageHandler(AccessibilityBridge.this.accessibilityMessageHandler);
                    AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityEnabled();
                } else {
                    accessibilityBridge.setAccessibleNavigation(false);
                    AccessibilityBridge.this.accessibilityChannel.setAccessibilityMessageHandler(null);
                    AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityDisabled();
                }
                if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                    AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(z10, AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
                }
            }
        };
        this.accessibilityStateChangeListener = accessibilityManagerAccessibilityStateChangeListenerC31842;
        C31853 c31853 = new ContentObserver(new Handler()) { // from class: io.flutter.view.AccessibilityBridge.3
            public C31853(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                onChange(z10, null);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z10, Uri uri) {
                if (AccessibilityBridge.this.isReleased) {
                    return;
                }
                String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(AccessibilityBridge.this.contentResolver, "transition_animation_scale");
                if (string != null && string.equals("0")) {
                    AccessibilityBridge.access$1176(AccessibilityBridge.this, AccessibilityFeature.DISABLE_ANIMATIONS.value);
                } else {
                    AccessibilityBridge.access$1172(AccessibilityBridge.this, ~AccessibilityFeature.DISABLE_ANIMATIONS.value);
                }
                AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
            }
        };
        this.animationScaleObserver = c31853;
        this.rootAccessibilityView = view;
        this.accessibilityChannel = accessibilityChannel;
        this.accessibilityManager = accessibilityManager;
        this.contentResolver = contentResolver;
        this.accessibilityViewEmbedder = accessibilityViewEmbedder;
        this.platformViewsAccessibilityDelegate = platformViewsAccessibilityDelegate;
        accessibilityManagerAccessibilityStateChangeListenerC31842.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC31842);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            AccessibilityManagerTouchExplorationStateChangeListenerC31864 accessibilityManagerTouchExplorationStateChangeListenerC31864 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: io.flutter.view.AccessibilityBridge.4
                public final /* synthetic */ AccessibilityManager val$accessibilityManager;

                public AccessibilityManagerTouchExplorationStateChangeListenerC31864(AccessibilityManager accessibilityManager2) {
                    r2 = accessibilityManager2;
                }

                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public void onTouchExplorationStateChanged(boolean z10) {
                    if (AccessibilityBridge.this.isReleased) {
                        return;
                    }
                    if (!z10) {
                        AccessibilityBridge.this.setAccessibleNavigation(false);
                        AccessibilityBridge.this.onTouchExplorationExit();
                    }
                    if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                        AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(r2.isEnabled(), z10);
                    }
                }
            };
            this.touchExplorationStateChangeListener = accessibilityManagerTouchExplorationStateChangeListenerC31864;
            accessibilityManagerTouchExplorationStateChangeListenerC31864.onTouchExplorationStateChanged(accessibilityManager2.isTouchExplorationEnabled());
            accessibilityManager2.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC31864);
        } else {
            this.touchExplorationStateChangeListener = null;
        }
        if (i10 >= 17) {
            c31853.onChange(false);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, c31853);
        }
        if (i10 >= 31) {
            setBoldTextFlag();
        }
        platformViewsAccessibilityDelegate.attachAccessibilityBridge(this);
    }

    public static /* synthetic */ int access$1172(AccessibilityBridge accessibilityBridge, int i10) {
        int i11 = i10 & accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i11;
        return i11;
    }

    public static /* synthetic */ int access$1176(AccessibilityBridge accessibilityBridge, int i10) {
        int i11 = i10 | accessibilityBridge.accessibilityFeatureFlags;
        accessibilityBridge.accessibilityFeatureFlags = i11;
        return i11;
    }

    private AccessibilityEvent createTextChangedEvent(int i10, String str, String str2) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i10, 16);
        obtainAccessibilityEvent.setBeforeText(str);
        obtainAccessibilityEvent.getText().add(str2);
        int i11 = 0;
        while (i11 < str.length() && i11 < str2.length() && str.charAt(i11) == str2.charAt(i11)) {
            i11++;
        }
        if (i11 >= str.length() && i11 >= str2.length()) {
            return null;
        }
        obtainAccessibilityEvent.setFromIndex(i11);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i11 && length2 >= i11 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        obtainAccessibilityEvent.setRemovedCount((length - i11) + 1);
        obtainAccessibilityEvent.setAddedCount((length2 - i11) + 1);
        return obtainAccessibilityEvent;
    }

    @TargetApi(28)
    private boolean doesLayoutInDisplayCutoutModeRequireLeftInset() {
        Activity activity = ViewUtils.getActivity(this.rootAccessibilityView.getContext());
        if (activity == null || activity.getWindow() == null) {
            return false;
        }
        int i10 = activity.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i10 == 2 || i10 == 0;
    }

    private Rect getBoundsInScreen(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.rootAccessibilityView.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public CustomAccessibilityAction getOrCreateAccessibilityAction(int i10) {
        CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i10));
        if (customAccessibilityAction != null) {
            return customAccessibilityAction;
        }
        CustomAccessibilityAction customAccessibilityAction2 = new CustomAccessibilityAction();
        customAccessibilityAction2.f11022id = i10;
        customAccessibilityAction2.resourceId = FIRST_RESOURCE_ID + i10;
        this.customAccessibilityActions.put(Integer.valueOf(i10), customAccessibilityAction2);
        return customAccessibilityAction2;
    }

    public SemanticsNode getOrCreateSemanticsNode(int i10) {
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i10));
        if (semanticsNode != null) {
            return semanticsNode;
        }
        SemanticsNode semanticsNode2 = new SemanticsNode(this);
        semanticsNode2.f11023id = i10;
        this.flutterSemanticsTree.put(Integer.valueOf(i10), semanticsNode2);
        return semanticsNode2;
    }

    private SemanticsNode getRootSemanticsNode() {
        return this.flutterSemanticsTree.get(0);
    }

    private void handleTouchExploration(float f10, float f11, boolean z10) {
        SemanticsNode hitTest;
        if (this.flutterSemanticsTree.isEmpty() || (hitTest = getRootSemanticsNode().hitTest(new float[]{f10, f11, 0.0f, 1.0f}, z10)) == this.hoveredObject) {
            return;
        }
        if (hitTest != null) {
            sendAccessibilityEvent(hitTest.f11023id, 128);
        }
        SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f11023id, 256);
        }
        this.hoveredObject = hitTest;
    }

    private boolean isImportant(SemanticsNode semanticsNode) {
        if (semanticsNode.hasFlag(Flag.SCOPES_ROUTE)) {
            return false;
        }
        return (semanticsNode.getValueLabelHint() == null && (semanticsNode.actions & (~systemAction)) == 0) ? false : true;
    }

    public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$0(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        return semanticsNode2 == semanticsNode;
    }

    public static /* synthetic */ boolean lambda$shouldSetCollectionInfo$1(SemanticsNode semanticsNode) {
        return semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING);
    }

    public AccessibilityEvent obtainAccessibilityEvent(int i10, int i11) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i11);
        obtainAccessibilityEvent.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtainAccessibilityEvent.setSource(this.rootAccessibilityView, i10);
        return obtainAccessibilityEvent;
    }

    public void onTouchExplorationExit() {
        SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f11023id, 256);
            this.hoveredObject = null;
        }
    }

    private void onWindowNameChange(SemanticsNode semanticsNode) {
        String routeName = semanticsNode.getRouteName();
        if (routeName == null) {
            routeName = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            setAccessibilityPaneTitle(routeName);
            return;
        }
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f11023id, 32);
        obtainAccessibilityEvent.getText().add(routeName);
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    @TargetApi(18)
    private boolean performCursorMoveAction(SemanticsNode semanticsNode, int i10, Bundle bundle, boolean z10) {
        int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i12 = semanticsNode.textSelectionBase;
        int i13 = semanticsNode.textSelectionExtent;
        predictCursorMovement(semanticsNode, i11, z10, z11);
        if (i12 != semanticsNode.textSelectionBase || i13 != semanticsNode.textSelectionExtent) {
            String str = semanticsNode.value != null ? semanticsNode.value : "";
            AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode.f11023id, 8192);
            obtainAccessibilityEvent.getText().add(str);
            obtainAccessibilityEvent.setFromIndex(semanticsNode.textSelectionBase);
            obtainAccessibilityEvent.setToIndex(semanticsNode.textSelectionExtent);
            obtainAccessibilityEvent.setItemCount(str.length());
            sendAccessibilityEvent(obtainAccessibilityEvent);
        }
        if (i11 == 1) {
            if (z10) {
                Action action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (semanticsNode.hasAction(action)) {
                    this.accessibilityChannel.dispatchSemanticsAction(i10, action, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            Action action2 = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!semanticsNode.hasAction(action2)) {
                return false;
            }
            this.accessibilityChannel.dispatchSemanticsAction(i10, action2, Boolean.valueOf(z11));
            return true;
        }
        if (i11 != 2) {
            return i11 == 4 || i11 == 8 || i11 == 16;
        }
        if (z10) {
            Action action3 = Action.MOVE_CURSOR_FORWARD_BY_WORD;
            if (semanticsNode.hasAction(action3)) {
                this.accessibilityChannel.dispatchSemanticsAction(i10, action3, Boolean.valueOf(z11));
                return true;
            }
        }
        if (z10) {
            return false;
        }
        Action action4 = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!semanticsNode.hasAction(action4)) {
            return false;
        }
        this.accessibilityChannel.dispatchSemanticsAction(i10, action4, Boolean.valueOf(z11));
        return true;
    }

    @TargetApi(21)
    private boolean performSetText(SemanticsNode semanticsNode, int i10, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.accessibilityChannel.dispatchSemanticsAction(i10, Action.SET_TEXT, string);
        semanticsNode.value = string;
        semanticsNode.valueAttributes = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r6 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        r5 = r4.value.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        r4.textSelectionExtent = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r4.textSelectionExtent = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r5.find() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        io.flutter.view.AccessibilityBridge.SemanticsNode.access$2112(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r5.find() != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r5.find() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r5.find() != false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void predictCursorMovement(io.flutter.view.AccessibilityBridge.SemanticsNode r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            if (r0 < 0) goto L111
            int r0 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2000(r4)
            if (r0 >= 0) goto Le
            goto L111
        Le:
            r0 = 1
            if (r5 == r0) goto Le9
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L94
            r1 = 4
            if (r5 == r1) goto L36
            r0 = 8
            if (r5 == r0) goto L22
            r0 = 16
            if (r5 == r0) goto L22
            goto L108
        L22:
            if (r6 == 0) goto L31
        L24:
            java.lang.String r5 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2400(r4)
            int r5 = r5.length()
        L2c:
            io.flutter.view.AccessibilityBridge.SemanticsNode.access$2102(r4, r5)
            goto L108
        L31:
            io.flutter.view.AccessibilityBridge.SemanticsNode.access$2102(r4, r2)
            goto L108
        L36:
            if (r6 == 0) goto L6b
            int r5 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            java.lang.String r1 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2400(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto L6b
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2400(r4)
            int r1 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
        L62:
            int r5 = r5.start(r0)
            io.flutter.view.AccessibilityBridge.SemanticsNode.access$2112(r4, r5)
            goto L108
        L6b:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2400(r4)
            int r1 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L31
        L8f:
            int r5 = r5.start(r0)
            goto L2c
        L94:
            if (r6 == 0) goto Lc4
            int r5 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            java.lang.String r1 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2400(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lc4
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2400(r4)
            int r1 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
            goto L62
        Lc4:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2400(r4)
            int r1 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L108
            goto L8f
        Le9:
            if (r6 == 0) goto Lfd
            int r5 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            java.lang.String r1 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2400(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lfd
            io.flutter.view.AccessibilityBridge.SemanticsNode.access$2112(r4, r0)
            goto L108
        Lfd:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            if (r5 <= 0) goto L108
            io.flutter.view.AccessibilityBridge.SemanticsNode.access$2120(r4, r0)
        L108:
            if (r7 != 0) goto L111
            int r5 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$2100(r4)
            io.flutter.view.AccessibilityBridge.SemanticsNode.access$2002(r4, r5)
        L111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityBridge.predictCursorMovement(io.flutter.view.AccessibilityBridge$SemanticsNode, int, boolean, boolean):void");
    }

    public void sendAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (this.accessibilityManager.isEnabled()) {
            this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(this.rootAccessibilityView, accessibilityEvent);
        }
    }

    public void sendLatestAccessibilityFlagsToFlutter() {
        this.accessibilityChannel.setAccessibilityFeatures(this.accessibilityFeatureFlags);
    }

    private void sendWindowContentChangeEvent(int i10) {
        AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(i10, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            obtainAccessibilityEvent.setContentChangeTypes(1);
        }
        sendAccessibilityEvent(obtainAccessibilityEvent);
    }

    @TargetApi(28)
    private void setAccessibilityPaneTitle(String str) {
        this.rootAccessibilityView.setAccessibilityPaneTitle(str);
    }

    public void setAccessibleNavigation(boolean z10) {
        if (this.accessibleNavigation == z10) {
            return;
        }
        this.accessibleNavigation = z10;
        this.accessibilityFeatureFlags = z10 ? this.accessibilityFeatureFlags | AccessibilityFeature.ACCESSIBLE_NAVIGATION.value : this.accessibilityFeatureFlags & (~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value);
        sendLatestAccessibilityFlagsToFlutter();
    }

    @TargetApi(C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable)
    private void setBoldTextFlag() {
        View view = this.rootAccessibilityView;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i10 = this.rootAccessibilityView.getResources().getConfiguration().fontWeightAdjustment;
        this.accessibilityFeatureFlags = i10 != Integer.MAX_VALUE && i10 >= BOLD_TEXT_WEIGHT_ADJUSTMENT ? this.accessibilityFeatureFlags | AccessibilityFeature.BOLD_TEXT.value : this.accessibilityFeatureFlags & AccessibilityFeature.BOLD_TEXT.value;
        sendLatestAccessibilityFlagsToFlutter();
    }

    private boolean shouldSetCollectionInfo(SemanticsNode semanticsNode) {
        return semanticsNode.scrollChildren > 0 && (SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new Predicate() { // from class: io.flutter.view.a
            public /* synthetic */ C3195a() {
            }

            @Override // io.flutter.util.Predicate
            public final boolean test(Object obj) {
                boolean lambda$shouldSetCollectionInfo$0;
                lambda$shouldSetCollectionInfo$0 = AccessibilityBridge.lambda$shouldSetCollectionInfo$0(AccessibilityBridge.SemanticsNode.this, (AccessibilityBridge.SemanticsNode) obj);
                return lambda$shouldSetCollectionInfo$0;
            }
        }) || !SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, C3196b.f11027a));
    }

    @TargetApi(19)
    private void willRemoveSemanticsNode(SemanticsNode semanticsNode) {
        View platformViewById;
        Integer num;
        semanticsNode.parent = null;
        if (semanticsNode.platformViewId != -1 && (num = this.embeddedAccessibilityFocusedNodeId) != null && this.accessibilityViewEmbedder.platformViewOfNode(num.intValue()) == this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) {
            sendAccessibilityEvent(this.embeddedAccessibilityFocusedNodeId.intValue(), MIN_ENGINE_GENERATED_NODE_ID);
            this.embeddedAccessibilityFocusedNodeId = null;
        }
        if (semanticsNode.platformViewId != -1 && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(semanticsNode.platformViewId)) != null) {
            platformViewById.setImportantForAccessibility(4);
        }
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 == semanticsNode) {
            sendAccessibilityEvent(semanticsNode2.f11023id, MIN_ENGINE_GENERATED_NODE_ID);
            this.accessibilityFocusedSemanticsNode = null;
        }
        if (this.inputFocusedSemanticsNode == semanticsNode) {
            this.inputFocusedSemanticsNode = null;
        }
        if (this.hoveredObject == semanticsNode) {
            this.hoveredObject = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0474 A[LOOP:0: B:197:0x046e->B:199:0x0474, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0499  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r17) {
        /*
            Method dump skipped, instructions count: 1235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityBridge.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean externalViewRequestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.embeddedInputFocusedNodeId = recordFlutterId;
            this.inputFocusedSemanticsNode = null;
            return true;
        }
        if (eventType == 128) {
            this.hoveredObject = null;
            return true;
        }
        if (eventType == 32768) {
            this.embeddedAccessibilityFocusedNodeId = recordFlutterId;
            this.accessibilityFocusedSemanticsNode = null;
            return true;
        }
        if (eventType != MIN_ENGINE_GENERATED_NODE_ID) {
            return true;
        }
        this.embeddedInputFocusedNodeId = null;
        this.embeddedAccessibilityFocusedNodeId = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0016, code lost:
    
        if (r2 != null) goto L38;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L7
            r0 = 2
            if (r2 == r0) goto L1d
            goto L27
        L7:
            io.flutter.view.AccessibilityBridge$SemanticsNode r2 = r1.inputFocusedSemanticsNode
            if (r2 == 0) goto L14
        Lb:
            int r2 = io.flutter.view.AccessibilityBridge.SemanticsNode.access$000(r2)
        Lf:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L14:
            java.lang.Integer r2 = r1.embeddedInputFocusedNodeId
            if (r2 == 0) goto L1d
        L18:
            int r2 = r2.intValue()
            goto Lf
        L1d:
            io.flutter.view.AccessibilityBridge$SemanticsNode r2 = r1.accessibilityFocusedSemanticsNode
            if (r2 == 0) goto L22
            goto Lb
        L22:
            java.lang.Integer r2 = r1.embeddedAccessibilityFocusedNodeId
            if (r2 == 0) goto L27
            goto L18
        L27:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityBridge.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean getAccessibleNavigation() {
        return this.accessibleNavigation;
    }

    public int getHoveredObjectId() {
        return this.hoveredObject.f11023id;
    }

    public boolean isAccessibilityEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    public boolean isTouchExplorationEnabled() {
        return this.accessibilityManager.isTouchExplorationEnabled();
    }

    public AccessibilityEvent obtainAccessibilityEvent(int i10) {
        return AccessibilityEvent.obtain(i10);
    }

    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo obtainAccessibilityNodeInfo(View view, int i10) {
        return AccessibilityNodeInfo.obtain(view, i10);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent) {
        return onAccessibilityHoverEvent(motionEvent, false);
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent, boolean z10) {
        if (!this.accessibilityManager.isTouchExplorationEnabled() || this.flutterSemanticsTree.isEmpty()) {
            return false;
        }
        SemanticsNode hitTest = getRootSemanticsNode().hitTest(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z10);
        if (hitTest != null && hitTest.platformViewId != -1) {
            if (z10) {
                return false;
            }
            return this.accessibilityViewEmbedder.onAccessibilityHoverEvent(hitTest.f11023id, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            handleTouchExploration(motionEvent.getX(), motionEvent.getY(), z10);
        } else {
            if (motionEvent.getAction() != 10) {
                Log.m11039d("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            onTouchExplorationExit();
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i10, int i11, Bundle bundle) {
        int i12;
        if (i10 >= MIN_ENGINE_GENERATED_NODE_ID) {
            boolean performAction = this.accessibilityViewEmbedder.performAction(i10, i11, bundle);
            if (performAction && i11 == 128) {
                this.embeddedAccessibilityFocusedNodeId = null;
            }
            return performAction;
        }
        SemanticsNode semanticsNode = this.flutterSemanticsTree.get(Integer.valueOf(i10));
        boolean z10 = false;
        if (semanticsNode == null) {
            return false;
        }
        switch (i11) {
            case 16:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.TAP);
                return true;
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.LONG_PRESS);
                return true;
            case C1417R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                if (this.accessibilityFocusedSemanticsNode == null) {
                    this.rootAccessibilityView.invalidate();
                }
                this.accessibilityFocusedSemanticsNode = semanticsNode;
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                sendAccessibilityEvent(i10, 32768);
                if (semanticsNode.hasAction(Action.INCREASE) || semanticsNode.hasAction(Action.DECREASE)) {
                    sendAccessibilityEvent(i10, 4);
                }
                return true;
            case 128:
                SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
                if (semanticsNode2 != null && semanticsNode2.f11023id == i10) {
                    this.accessibilityFocusedSemanticsNode = null;
                }
                Integer num = this.embeddedAccessibilityFocusedNodeId;
                if (num != null && num.intValue() == i10) {
                    this.embeddedAccessibilityFocusedNodeId = null;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                sendAccessibilityEvent(i10, MIN_ENGINE_GENERATED_NODE_ID);
                return true;
            case 256:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return performCursorMoveAction(semanticsNode, i10, bundle, true);
            case 512:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return performCursorMoveAction(semanticsNode, i10, bundle, false);
            case 4096:
                Action action = Action.SCROLL_UP;
                if (!semanticsNode.hasAction(action)) {
                    action = Action.SCROLL_LEFT;
                    if (!semanticsNode.hasAction(action)) {
                        action = Action.INCREASE;
                        if (!semanticsNode.hasAction(action)) {
                            return false;
                        }
                        semanticsNode.value = semanticsNode.increasedValue;
                        semanticsNode.valueAttributes = semanticsNode.increasedValueAttributes;
                        sendAccessibilityEvent(i10, 4);
                    }
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, action);
                return true;
            case 8192:
                Action action2 = Action.SCROLL_DOWN;
                if (!semanticsNode.hasAction(action2)) {
                    action2 = Action.SCROLL_RIGHT;
                    if (!semanticsNode.hasAction(action2)) {
                        action2 = Action.DECREASE;
                        if (!semanticsNode.hasAction(action2)) {
                            return false;
                        }
                        semanticsNode.value = semanticsNode.decreasedValue;
                        semanticsNode.valueAttributes = semanticsNode.decreasedValueAttributes;
                        sendAccessibilityEvent(i10, 4);
                    }
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, action2);
                return true;
            case 16384:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.COPY);
                return true;
            case 32768:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.PASTE);
                return true;
            case MIN_ENGINE_GENERATED_NODE_ID /* 65536 */:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.CUT);
                return true;
            case 131072:
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z10 = true;
                }
                if (z10) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i12 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(semanticsNode.textSelectionExtent));
                    i12 = semanticsNode.textSelectionExtent;
                }
                hashMap.put("extent", Integer.valueOf(i12));
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.SET_SELECTION, hashMap);
                SemanticsNode semanticsNode3 = this.flutterSemanticsTree.get(Integer.valueOf(i10));
                semanticsNode3.textSelectionBase = ((Integer) hashMap.get("base")).intValue();
                semanticsNode3.textSelectionExtent = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.DISMISS);
                return true;
            case 2097152:
                if (Build.VERSION.SDK_INT < 21) {
                    return false;
                }
                return performSetText(semanticsNode, i10, bundle);
            case 16908342:
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.SHOW_ON_SCREEN);
                return true;
            default:
                CustomAccessibilityAction customAccessibilityAction = this.customAccessibilityActions.get(Integer.valueOf(i11 - FIRST_RESOURCE_ID));
                if (customAccessibilityAction == null) {
                    return false;
                }
                this.accessibilityChannel.dispatchSemanticsAction(i10, Action.CUSTOM_ACTION, Integer.valueOf(customAccessibilityAction.f11022id));
                return true;
        }
    }

    public void release() {
        this.isReleased = true;
        this.platformViewsAccessibilityDelegate.detachAccessibilityBridge();
        setOnAccessibilityChangeListener(null);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        if (Build.VERSION.SDK_INT >= 19) {
            this.accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
        this.accessibilityChannel.setAccessibilityMessageHandler(null);
    }

    public void reset() {
        this.flutterSemanticsTree.clear();
        SemanticsNode semanticsNode = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode != null) {
            sendAccessibilityEvent(semanticsNode.f11023id, MIN_ENGINE_GENERATED_NODE_ID);
        }
        this.accessibilityFocusedSemanticsNode = null;
        this.hoveredObject = null;
        sendWindowContentChangeEvent(0);
    }

    public void sendAccessibilityEvent(int i10, int i11) {
        if (this.accessibilityManager.isEnabled()) {
            sendAccessibilityEvent(obtainAccessibilityEvent(i10, i11));
        }
    }

    public void setOnAccessibilityChangeListener(OnAccessibilityChangeListener onAccessibilityChangeListener) {
        this.onAccessibilityChangeListener = onAccessibilityChangeListener;
    }

    public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            CustomAccessibilityAction orCreateAccessibilityAction = getOrCreateAccessibilityAction(byteBuffer.getInt());
            orCreateAccessibilityAction.overrideId = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            String str = null;
            orCreateAccessibilityAction.label = i10 == -1 ? null : strArr[i10];
            int i11 = byteBuffer.getInt();
            if (i11 != -1) {
                str = strArr[i11];
            }
            orCreateAccessibilityAction.hint = str;
        }
    }

    public void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        SemanticsNode semanticsNode;
        SemanticsNode semanticsNode2;
        float f10;
        float f11;
        WindowInsets rootWindowInsets;
        View platformViewById;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            SemanticsNode orCreateSemanticsNode = getOrCreateSemanticsNode(byteBuffer.getInt());
            orCreateSemanticsNode.updateWith(byteBuffer, strArr, byteBufferArr);
            if (!orCreateSemanticsNode.hasFlag(Flag.IS_HIDDEN)) {
                if (orCreateSemanticsNode.hasFlag(Flag.IS_FOCUSED)) {
                    this.inputFocusedSemanticsNode = orCreateSemanticsNode;
                }
                if (orCreateSemanticsNode.hadPreviousConfig) {
                    arrayList.add(orCreateSemanticsNode);
                }
                if (orCreateSemanticsNode.platformViewId != -1 && !this.platformViewsAccessibilityDelegate.usesVirtualDisplay(orCreateSemanticsNode.platformViewId) && (platformViewById = this.platformViewsAccessibilityDelegate.getPlatformViewById(orCreateSemanticsNode.platformViewId)) != null) {
                    platformViewById.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        SemanticsNode rootSemanticsNode = getRootSemanticsNode();
        ArrayList<SemanticsNode> arrayList2 = new ArrayList();
        if (rootSemanticsNode != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                if ((i10 >= 28 ? doesLayoutInDisplayCutoutModeRequireLeftInset() : true) && (rootWindowInsets = this.rootAccessibilityView.getRootWindowInsets()) != null) {
                    if (!this.lastLeftFrameInset.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                        rootSemanticsNode.globalGeometryDirty = true;
                        rootSemanticsNode.inverseTransformDirty = true;
                    }
                    this.lastLeftFrameInset = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                    Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
                }
            }
            rootSemanticsNode.updateRecursively(fArr, hashSet, false);
            rootSemanticsNode.collectRoutes(arrayList2);
        }
        SemanticsNode semanticsNode3 = null;
        for (SemanticsNode semanticsNode4 : arrayList2) {
            if (!this.flutterNavigationStack.contains(Integer.valueOf(semanticsNode4.f11023id))) {
                semanticsNode3 = semanticsNode4;
            }
        }
        if (semanticsNode3 == null && arrayList2.size() > 0) {
            semanticsNode3 = (SemanticsNode) arrayList2.get(arrayList2.size() - 1);
        }
        if (semanticsNode3 != null && (semanticsNode3.f11023id != this.previousRouteId || arrayList2.size() != this.flutterNavigationStack.size())) {
            this.previousRouteId = semanticsNode3.f11023id;
            onWindowNameChange(semanticsNode3);
        }
        this.flutterNavigationStack.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.flutterNavigationStack.add(Integer.valueOf(((SemanticsNode) it.next()).f11023id));
        }
        Iterator<Map.Entry<Integer, SemanticsNode>> it2 = this.flutterSemanticsTree.entrySet().iterator();
        while (it2.hasNext()) {
            SemanticsNode value = it2.next().getValue();
            if (!hashSet.contains(value)) {
                willRemoveSemanticsNode(value);
                it2.remove();
            }
        }
        sendWindowContentChangeEvent(0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SemanticsNode semanticsNode5 = (SemanticsNode) it3.next();
            if (semanticsNode5.didScroll()) {
                AccessibilityEvent obtainAccessibilityEvent = obtainAccessibilityEvent(semanticsNode5.f11023id, 4096);
                float f12 = semanticsNode5.scrollPosition;
                float f13 = semanticsNode5.scrollExtentMax;
                if (Float.isInfinite(semanticsNode5.scrollExtentMax)) {
                    if (f12 > SCROLL_POSITION_CAP_FOR_INFINITY) {
                        f12 = 70000.0f;
                    }
                    f13 = 100000.0f;
                }
                if (Float.isInfinite(semanticsNode5.scrollExtentMin)) {
                    f10 = f13 + SCROLL_EXTENT_FOR_INFINITY;
                    if (f12 < -70000.0f) {
                        f12 = -70000.0f;
                    }
                    f11 = f12 + SCROLL_EXTENT_FOR_INFINITY;
                } else {
                    f10 = f13 - semanticsNode5.scrollExtentMin;
                    f11 = f12 - semanticsNode5.scrollExtentMin;
                }
                if (semanticsNode5.hadAction(Action.SCROLL_UP) || semanticsNode5.hadAction(Action.SCROLL_DOWN)) {
                    obtainAccessibilityEvent.setScrollY((int) f11);
                    obtainAccessibilityEvent.setMaxScrollY((int) f10);
                } else if (semanticsNode5.hadAction(Action.SCROLL_LEFT) || semanticsNode5.hadAction(Action.SCROLL_RIGHT)) {
                    obtainAccessibilityEvent.setScrollX((int) f11);
                    obtainAccessibilityEvent.setMaxScrollX((int) f10);
                }
                if (semanticsNode5.scrollChildren > 0) {
                    obtainAccessibilityEvent.setItemCount(semanticsNode5.scrollChildren);
                    obtainAccessibilityEvent.setFromIndex(semanticsNode5.scrollIndex);
                    Iterator it4 = semanticsNode5.childrenInHitTestOrder.iterator();
                    int i11 = 0;
                    while (it4.hasNext()) {
                        if (!((SemanticsNode) it4.next()).hasFlag(Flag.IS_HIDDEN)) {
                            i11++;
                        }
                    }
                    obtainAccessibilityEvent.setToIndex((semanticsNode5.scrollIndex + i11) - 1);
                }
                sendAccessibilityEvent(obtainAccessibilityEvent);
            }
            if (semanticsNode5.hasFlag(Flag.IS_LIVE_REGION) && semanticsNode5.didChangeLabel()) {
                sendWindowContentChangeEvent(semanticsNode5.f11023id);
            }
            SemanticsNode semanticsNode6 = this.accessibilityFocusedSemanticsNode;
            if (semanticsNode6 != null && semanticsNode6.f11023id == semanticsNode5.f11023id) {
                Flag flag = Flag.IS_SELECTED;
                if (!semanticsNode5.hadFlag(flag) && semanticsNode5.hasFlag(flag)) {
                    AccessibilityEvent obtainAccessibilityEvent2 = obtainAccessibilityEvent(semanticsNode5.f11023id, 4);
                    obtainAccessibilityEvent2.getText().add(semanticsNode5.label);
                    sendAccessibilityEvent(obtainAccessibilityEvent2);
                }
            }
            SemanticsNode semanticsNode7 = this.inputFocusedSemanticsNode;
            if (semanticsNode7 != null && semanticsNode7.f11023id == semanticsNode5.f11023id && ((semanticsNode2 = this.lastInputFocusedSemanticsNode) == null || semanticsNode2.f11023id != this.inputFocusedSemanticsNode.f11023id)) {
                this.lastInputFocusedSemanticsNode = this.inputFocusedSemanticsNode;
                sendAccessibilityEvent(obtainAccessibilityEvent(semanticsNode5.f11023id, 8));
            } else if (this.inputFocusedSemanticsNode == null) {
                this.lastInputFocusedSemanticsNode = null;
            }
            SemanticsNode semanticsNode8 = this.inputFocusedSemanticsNode;
            if (semanticsNode8 != null && semanticsNode8.f11023id == semanticsNode5.f11023id) {
                Flag flag2 = Flag.IS_TEXT_FIELD;
                if (semanticsNode5.hadFlag(flag2) && semanticsNode5.hasFlag(flag2) && ((semanticsNode = this.accessibilityFocusedSemanticsNode) == null || semanticsNode.f11023id == this.inputFocusedSemanticsNode.f11023id)) {
                    String str = semanticsNode5.previousValue != null ? semanticsNode5.previousValue : "";
                    String str2 = semanticsNode5.value != null ? semanticsNode5.value : "";
                    AccessibilityEvent createTextChangedEvent = createTextChangedEvent(semanticsNode5.f11023id, str, str2);
                    if (createTextChangedEvent != null) {
                        sendAccessibilityEvent(createTextChangedEvent);
                    }
                    if (semanticsNode5.previousTextSelectionBase != semanticsNode5.textSelectionBase || semanticsNode5.previousTextSelectionExtent != semanticsNode5.textSelectionExtent) {
                        AccessibilityEvent obtainAccessibilityEvent3 = obtainAccessibilityEvent(semanticsNode5.f11023id, 8192);
                        obtainAccessibilityEvent3.getText().add(str2);
                        obtainAccessibilityEvent3.setFromIndex(semanticsNode5.textSelectionBase);
                        obtainAccessibilityEvent3.setToIndex(semanticsNode5.textSelectionExtent);
                        obtainAccessibilityEvent3.setItemCount(str2.length());
                        sendAccessibilityEvent(obtainAccessibilityEvent3);
                    }
                }
            }
        }
    }
}
