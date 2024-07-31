package io.flutter.plugins.firebase.auth;

import android.net.Uri;
import com.google.firebase.auth.C1260b;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p321w7.AbstractC5340a;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5368h;
import p321w7.AbstractC5377j0;
import p321w7.AbstractC5388m0;
import p321w7.C5342a1;
import p321w7.C5344b;
import p321w7.C5349c0;
import p321w7.C5356e;
import p321w7.C5357e0;
import p321w7.C5365g0;
import p321w7.C5380k;
import p321w7.C5387m;
import p321w7.C5391n0;
import p321w7.C5403r0;
import p321w7.C5409t0;
import p321w7.InterfaceC5346b1;
import p321w7.InterfaceC5352d;
import p321w7.InterfaceC5364g;
import p321w7.InterfaceC5372i;

/* loaded from: classes2.dex */
public class PigeonParser {
    public static C5356e getActionCodeSettings(GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings) {
        C5356e.a m21465O = C5356e.m21465O();
        m21465O.m21488f(pigeonActionCodeSettings.getUrl());
        if (pigeonActionCodeSettings.getDynamicLinkDomain() != null) {
            m21465O.m21485c(pigeonActionCodeSettings.getDynamicLinkDomain());
        }
        m21465O.m21486d(pigeonActionCodeSettings.getHandleCodeInApp().booleanValue());
        if (pigeonActionCodeSettings.getAndroidPackageName() != null) {
            m21465O.m21484b(pigeonActionCodeSettings.getAndroidPackageName(), pigeonActionCodeSettings.getAndroidInstallApp().booleanValue(), pigeonActionCodeSettings.getAndroidMinimumVersion());
        }
        if (pigeonActionCodeSettings.getIOSBundleId() != null) {
            m21465O.m21487e(pigeonActionCodeSettings.getIOSBundleId());
        }
        return m21465O.m21483a();
    }

    public static AbstractC5368h getCredential(Map<String, Object> map) {
        if (map.get("token") != null) {
            AbstractC5368h abstractC5368h = FlutterFirebaseAuthPlugin.authCredentials.get(Integer.valueOf(((Integer) map.get("token")).intValue()));
            if (abstractC5368h != null) {
                return abstractC5368h;
            }
            throw FlutterFirebaseAuthPluginException.invalidCredential();
        }
        Object obj = map.get(Constants.SIGN_IN_METHOD);
        Objects.requireNonNull(obj);
        String str = (String) obj;
        String str2 = (String) map.get(Constants.SECRET);
        String str3 = (String) map.get(Constants.ID_TOKEN);
        String str4 = (String) map.get(Constants.ACCESS_TOKEN);
        String str5 = (String) map.get(Constants.RAW_NONCE);
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals(Constants.SIGN_IN_METHOD_TWITTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1551433523:
                if (str.equals(Constants.SIGN_IN_METHOD_PLAY_GAMES)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals(Constants.SIGN_IN_METHOD_GOOGLE)) {
                    c10 = 2;
                    break;
                }
                break;
            case -364826023:
                if (str.equals(Constants.SIGN_IN_METHOD_FACEBOOK)) {
                    c10 = 3;
                    break;
                }
                break;
            case 105516695:
                if (str.equals(Constants.SIGN_IN_METHOD_OAUTH)) {
                    c10 = 4;
                    break;
                }
                break;
            case 106642798:
                if (str.equals(Constants.SIGN_IN_METHOD_PHONE)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1985010934:
                if (str.equals(Constants.SIGN_IN_METHOD_GITHUB)) {
                    c10 = 7;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                Objects.requireNonNull(str4);
                Objects.requireNonNull(str2);
                return C5342a1.m21440a(str4, str2);
            case 1:
                Object obj2 = map.get(Constants.SERVER_AUTH_CODE);
                Objects.requireNonNull(obj2);
                return C5409t0.m21553a((String) obj2);
            case 2:
                return C5365g0.m21500a(str3, str4);
            case 3:
                Objects.requireNonNull(str4);
                return C5387m.m21524a(str4);
            case 4:
                Object obj3 = map.get(Constants.PROVIDER_ID);
                Objects.requireNonNull(obj3);
                C5391n0.b m21533f = C5391n0.m21533f((String) obj3);
                Objects.requireNonNull(str4);
                m21533f.m21538b(str4);
                Objects.requireNonNull(str3);
                if (str5 == null) {
                    m21533f.m21539c(str3);
                } else {
                    m21533f.m21540d(str3, str5);
                }
                return m21533f.m21537a();
            case 5:
                Object obj4 = map.get(Constants.VERIFICATION_ID);
                Objects.requireNonNull(obj4);
                Object obj5 = map.get(Constants.SMS_CODE);
                Objects.requireNonNull(obj5);
                return C1260b.m5291a((String) obj4, (String) obj5);
            case 6:
                Object obj6 = map.get(Constants.EMAIL);
                Objects.requireNonNull(obj6);
                Objects.requireNonNull(str2);
                return C5380k.m21517a((String) obj6, str2);
            case 7:
                Objects.requireNonNull(str4);
                return C5357e0.m21489a(str4);
            case '\b':
                Object obj7 = map.get(Constants.EMAIL);
                Objects.requireNonNull(obj7);
                Object obj8 = map.get("emailLink");
                Objects.requireNonNull(obj8);
                return C5380k.m21518b((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    public static List<List<Object>> multiFactorInfoToMap(List<AbstractC5377j0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo> it = multiFactorInfoToPigeon(list).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toList());
        }
        return arrayList;
    }

    public static List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo> multiFactorInfoToPigeon(List<AbstractC5377j0> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC5377j0 abstractC5377j0 : list) {
            arrayList.add((abstractC5377j0 instanceof C5403r0 ? new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.Builder().setPhoneNumber(((C5403r0) abstractC5377j0).m21551m()) : new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.Builder()).setDisplayName(abstractC5377j0.mo21516s()).setEnrollmentTimestamp(Double.valueOf(abstractC5377j0.mo21512I())).setUid(abstractC5377j0.mo21515b()).setFactorId(abstractC5377j0.mo21513J()).build());
        }
        return arrayList;
    }

    public static GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo parseActionCodeResult(InterfaceC5352d interfaceC5352d) {
        GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation actionCodeInfoOperation;
        C5344b mo21460b;
        GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.Builder();
        GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.Builder builder2 = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.Builder();
        int mo21459a = interfaceC5352d.mo21459a();
        if (mo21459a == 0) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.PASSWORD_RESET;
        } else if (mo21459a == 1) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.VERIFY_EMAIL;
        } else if (mo21459a == 2) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.RECOVER_EMAIL;
        } else if (mo21459a == 4) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.EMAIL_SIGN_IN;
        } else {
            if (mo21459a != 5) {
                if (mo21459a == 6) {
                    actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.REVERT_SECOND_FACTOR_ADDITION;
                }
                mo21460b = interfaceC5352d.mo21460b();
                if ((mo21460b == null && mo21459a == 1) || mo21459a == 0) {
                    builder2.setEmail(mo21460b.mo21405a());
                } else if (mo21459a != 2 || mo21459a == 5) {
                    Objects.requireNonNull(mo21460b);
                    AbstractC5340a abstractC5340a = (AbstractC5340a) mo21460b;
                    builder2.setEmail(abstractC5340a.mo21405a());
                    builder2.setPreviousEmail(abstractC5340a.mo21406b());
                }
                builder.setData(builder2.build());
                return builder.build();
            }
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.VERIFY_AND_CHANGE_EMAIL;
        }
        builder.setOperation(actionCodeInfoOperation);
        mo21460b = interfaceC5352d.mo21460b();
        if (mo21460b == null) {
        }
        if (mo21459a != 2) {
        }
        Objects.requireNonNull(mo21460b);
        AbstractC5340a abstractC5340a2 = (AbstractC5340a) mo21460b;
        builder2.setEmail(abstractC5340a2.mo21405a());
        builder2.setPreviousEmail(abstractC5340a2.mo21406b());
        builder.setData(builder2.build());
        return builder.build();
    }

    private static GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo parseAdditionalUserInfo(InterfaceC5364g interfaceC5364g) {
        if (interfaceC5364g == null) {
            return null;
        }
        GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.Builder();
        builder.setIsNewUser(Boolean.valueOf(interfaceC5364g.mo21496D()));
        builder.setProfile(interfaceC5364g.mo21499x());
        builder.setProviderId(interfaceC5364g.mo21497c());
        builder.setUsername(interfaceC5364g.mo21498q());
        return builder.build();
    }

    public static GeneratedAndroidFirebaseAuth.PigeonAuthCredential parseAuthCredential(AbstractC5368h abstractC5368h) {
        if (abstractC5368h == null) {
            return null;
        }
        int hashCode = abstractC5368h.hashCode();
        FlutterFirebaseAuthPlugin.authCredentials.put(Integer.valueOf(hashCode), abstractC5368h);
        GeneratedAndroidFirebaseAuth.PigeonAuthCredential.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonAuthCredential.Builder();
        builder.setProviderId(abstractC5368h.mo21462I());
        builder.setSignInMethod(abstractC5368h.mo21463J());
        builder.setNativeId(Long.valueOf(hashCode));
        if (abstractC5368h instanceof AbstractC5388m0) {
            builder.setAccessToken(((AbstractC5388m0) abstractC5368h).mo21525L());
        }
        return builder.build();
    }

    public static GeneratedAndroidFirebaseAuth.PigeonUserCredential parseAuthResult(InterfaceC5372i interfaceC5372i) {
        GeneratedAndroidFirebaseAuth.PigeonUserCredential.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonUserCredential.Builder();
        builder.setAdditionalUserInfo(parseAdditionalUserInfo(interfaceC5372i.mo21506v()));
        builder.setCredential(parseAuthCredential(interfaceC5372i.mo21507w()));
        builder.setUser(parseFirebaseUser(interfaceC5372i.mo21505B()));
        return builder.build();
    }

    public static GeneratedAndroidFirebaseAuth.PigeonUserDetails parseFirebaseUser(AbstractC5341a0 abstractC5341a0) {
        if (abstractC5341a0 == null) {
            return null;
        }
        GeneratedAndroidFirebaseAuth.PigeonUserDetails.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonUserDetails.Builder();
        GeneratedAndroidFirebaseAuth.PigeonUserInfo.Builder builder2 = new GeneratedAndroidFirebaseAuth.PigeonUserInfo.Builder();
        builder2.setDisplayName(abstractC5341a0.mo21439s());
        builder2.setEmail(abstractC5341a0.mo21407C());
        builder2.setIsEmailVerified(Boolean.valueOf(abstractC5341a0.mo21444h()));
        builder2.setIsAnonymous(Boolean.valueOf(abstractC5341a0.mo21414O()));
        if (abstractC5341a0.mo21410K() != null) {
            builder2.setCreationTimestamp(Long.valueOf(abstractC5341a0.mo21410K().mo21441o()));
            builder2.setLastSignInTimestamp(Long.valueOf(abstractC5341a0.mo21410K().mo21442t()));
        }
        builder2.setPhoneNumber(abstractC5341a0.mo21438m());
        builder2.setPhotoUrl(parsePhotoUrl(abstractC5341a0.mo21431e()));
        builder2.setUid(abstractC5341a0.mo21427b());
        builder2.setTenantId(abstractC5341a0.mo21413N());
        builder.setUserInfo(builder2.build());
        builder.setProviderData(parseUserInfoList(abstractC5341a0.mo21412M()));
        return builder.build();
    }

    private static String parsePhotoUrl(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if ("".equals(uri2)) {
            return null;
        }
        return uri2;
    }

    public static GeneratedAndroidFirebaseAuth.PigeonIdTokenResult parseTokenResult(C5349c0 c5349c0) {
        GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.Builder();
        builder.setToken(c5349c0.m21451g());
        builder.setSignInProvider(c5349c0.m21449e());
        builder.setAuthTimestamp(Long.valueOf(c5349c0.m21445a() * 1000));
        builder.setExpirationTimestamp(Long.valueOf(c5349c0.m21447c() * 1000));
        builder.setIssuedAtTimestamp(Long.valueOf(c5349c0.m21448d() * 1000));
        builder.setClaims(c5349c0.m21446b());
        builder.setSignInSecondFactor(c5349c0.m21450f());
        return builder.build();
    }

    private static List<Map<Object, Object>> parseUserInfoList(List<? extends InterfaceC5346b1> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            InterfaceC5346b1 interfaceC5346b1 = (InterfaceC5346b1) it.next();
            if (interfaceC5346b1 != null && !"firebase".equals(interfaceC5346b1.mo21443c())) {
                arrayList.add(parseUserInfoToMap(interfaceC5346b1));
            }
        }
        return arrayList;
    }

    private static Map<Object, Object> parseUserInfoToMap(InterfaceC5346b1 interfaceC5346b1) {
        HashMap hashMap = new HashMap();
        hashMap.put("displayName", interfaceC5346b1.mo21439s());
        hashMap.put(Constants.EMAIL, interfaceC5346b1.mo21407C());
        hashMap.put("isEmailVerified", Boolean.valueOf(interfaceC5346b1.mo21444h()));
        hashMap.put("phoneNumber", interfaceC5346b1.mo21438m());
        hashMap.put("photoUrl", parsePhotoUrl(interfaceC5346b1.mo21431e()));
        hashMap.put("uid", interfaceC5346b1.mo21427b() == null ? "" : interfaceC5346b1.mo21427b());
        hashMap.put(Constants.PROVIDER_ID, interfaceC5346b1.mo21443c());
        hashMap.put("isAnonymous", Boolean.FALSE);
        return hashMap;
    }
}
