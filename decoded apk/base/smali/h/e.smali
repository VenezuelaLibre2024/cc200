.class public Lh/e;
.super Lh/d;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;
.implements Landroid/view/LayoutInflater$Factory2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh/e$o;,
        Lh/e$n;,
        Lh/e$m;,
        Lh/e$l;,
        Lh/e$h;,
        Lh/e$q;,
        Lh/e$s;,
        Lh/e$r;,
        Lh/e$p;,
        Lh/e$i;,
        Lh/e$u;,
        Lh/e$v;,
        Lh/e$j;,
        Lh/e$w;,
        Lh/e$k;,
        Lh/e$t;
    }
.end annotation


# static fields
.field public static final i0:Lu/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu/g<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final j0:Z

.field public static final k0:[I

.field public static final l0:Z

.field public static final m0:Z

.field public static n0:Z


# instance fields
.field public A:Z

.field public B:Z

.field public C:Landroid/view/ViewGroup;

.field public D:Landroid/widget/TextView;

.field public E:Landroid/view/View;

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:[Lh/e$v;

.field public O:Lh/e$v;

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:Landroid/content/res/Configuration;

.field public U:I

.field public V:I

.field public W:Z

.field public X:Z

.field public Y:Lh/e$r;

.field public Z:Lh/e$r;

.field public a0:Z

.field public b0:I

.field public final c0:Ljava/lang/Runnable;

.field public d0:Z

.field public e0:Landroid/graphics/Rect;

.field public f0:Landroid/graphics/Rect;

.field public g0:Lh/h;

.field public h0:Lh/i;

.field public final k:Ljava/lang/Object;

.field public final l:Landroid/content/Context;

.field public m:Landroid/view/Window;

.field public n:Lh/e$p;

.field public final o:Lh/c;

.field public p:Lh/a;

.field public q:Landroid/view/MenuInflater;

.field public r:Ljava/lang/CharSequence;

.field public s:Ln/f0;

.field public t:Lh/e$j;

.field public u:Lh/e$w;

.field public v:Ll/b;

.field public w:Landroidx/appcompat/widget/ActionBarContextView;

.field public x:Landroid/widget/PopupWindow;

.field public y:Ljava/lang/Runnable;

.field public z:Lk0/h0;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lu/g;

    invoke-direct {v0}, Lu/g;-><init>()V

    sput-object v0, Lh/e;->i0:Lu/g;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x15

    if-ge v0, v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    sput-boolean v3, Lh/e;->j0:Z

    new-array v4, v2, [I

    const v5, 0x1010054

    aput v5, v4, v1

    sput-object v4, Lh/e;->k0:[I

    sget-object v4, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v5, "robolectric"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v2

    sput-boolean v4, Lh/e;->l0:Z

    const/16 v4, 0x11

    if-lt v0, v4, :cond_1

    move v1, v2

    :cond_1
    sput-boolean v1, Lh/e;->m0:Z

    if-eqz v3, :cond_2

    sget-boolean v0, Lh/e;->n0:Z

    if-nez v0, :cond_2

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    new-instance v1, Lh/e$a;

    invoke-direct {v1, v0}, Lh/e$a;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    sput-boolean v2, Lh/e;->n0:Z

    :cond_2
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lh/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, p1}, Lh/e;-><init>(Landroid/content/Context;Landroid/view/Window;Lh/c;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;Lh/c;)V
    .locals 2

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2, p1}, Lh/e;-><init>(Landroid/content/Context;Landroid/view/Window;Lh/c;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lh/c;Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, Lh/d;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lh/e;->z:Lk0/h0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/e;->A:Z

    const/16 v0, -0x64

    iput v0, p0, Lh/e;->U:I

    new-instance v1, Lh/e$b;

    invoke-direct {v1, p0}, Lh/e$b;-><init>(Lh/e;)V

    iput-object v1, p0, Lh/e;->c0:Ljava/lang/Runnable;

    iput-object p1, p0, Lh/e;->l:Landroid/content/Context;

    iput-object p3, p0, Lh/e;->o:Lh/c;

    iput-object p4, p0, Lh/e;->k:Ljava/lang/Object;

    iget p1, p0, Lh/e;->U:I

    if-ne p1, v0, :cond_0

    instance-of p1, p4, Landroid/app/Dialog;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lh/e;->L0()Landroidx/appcompat/app/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/app/b;->getDelegate()Lh/d;

    move-result-object p1

    invoke-virtual {p1}, Lh/d;->l()I

    move-result p1

    iput p1, p0, Lh/e;->U:I

    :cond_0
    iget p1, p0, Lh/e;->U:I

    if-ne p1, v0, :cond_1

    sget-object p1, Lh/e;->i0:Lu/g;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lu/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iput p3, p0, Lh/e;->U:I

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lu/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p0, p2}, Lh/e;->M(Landroid/view/Window;)V

    :cond_2
    invoke-static {}, Ln/j;->h()V

    return-void
.end method

.method public static d0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;
    .locals 5

    new-instance v0, Landroid/content/res/Configuration;

    invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p1, :cond_16

    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget v1, p0, Landroid/content/res/Configuration;->fontScale:F

    iget v2, p1, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_1

    iput v2, v0, Landroid/content/res/Configuration;->fontScale:F

    :cond_1
    iget v1, p0, Landroid/content/res/Configuration;->mcc:I

    iget v2, p1, Landroid/content/res/Configuration;->mcc:I

    if-eq v1, v2, :cond_2

    iput v2, v0, Landroid/content/res/Configuration;->mcc:I

    :cond_2
    iget v1, p0, Landroid/content/res/Configuration;->mnc:I

    iget v2, p1, Landroid/content/res/Configuration;->mnc:I

    if-eq v1, v2, :cond_3

    iput v2, v0, Landroid/content/res/Configuration;->mnc:I

    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_4

    invoke-static {p0, p1, v0}, Lh/e$n;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    goto :goto_0

    :cond_4
    iget-object v2, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iget-object v3, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {v2, v3}, Lj0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object v2, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    :cond_5
    :goto_0
    iget v2, p0, Landroid/content/res/Configuration;->touchscreen:I

    iget v3, p1, Landroid/content/res/Configuration;->touchscreen:I

    if-eq v2, v3, :cond_6

    iput v3, v0, Landroid/content/res/Configuration;->touchscreen:I

    :cond_6
    iget v2, p0, Landroid/content/res/Configuration;->keyboard:I

    iget v3, p1, Landroid/content/res/Configuration;->keyboard:I

    if-eq v2, v3, :cond_7

    iput v3, v0, Landroid/content/res/Configuration;->keyboard:I

    :cond_7
    iget v2, p0, Landroid/content/res/Configuration;->keyboardHidden:I

    iget v3, p1, Landroid/content/res/Configuration;->keyboardHidden:I

    if-eq v2, v3, :cond_8

    iput v3, v0, Landroid/content/res/Configuration;->keyboardHidden:I

    :cond_8
    iget v2, p0, Landroid/content/res/Configuration;->navigation:I

    iget v3, p1, Landroid/content/res/Configuration;->navigation:I

    if-eq v2, v3, :cond_9

    iput v3, v0, Landroid/content/res/Configuration;->navigation:I

    :cond_9
    iget v2, p0, Landroid/content/res/Configuration;->navigationHidden:I

    iget v3, p1, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v2, v3, :cond_a

    iput v3, v0, Landroid/content/res/Configuration;->navigationHidden:I

    :cond_a
    iget v2, p0, Landroid/content/res/Configuration;->orientation:I

    iget v3, p1, Landroid/content/res/Configuration;->orientation:I

    if-eq v2, v3, :cond_b

    iput v3, v0, Landroid/content/res/Configuration;->orientation:I

    :cond_b
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v2, v2, 0xf

    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v3, 0xf

    if-eq v2, v4, :cond_c

    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v3, v3, 0xf

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_c
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v2, v2, 0xc0

    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v4, v3, 0xc0

    if-eq v2, v4, :cond_d

    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v3, v3, 0xc0

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_d
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v2, v2, 0x30

    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v3, 0x30

    if-eq v2, v4, :cond_e

    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v3, v3, 0x30

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_e
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v2, v2, 0x300

    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v4, v3, 0x300

    if-eq v2, v4, :cond_f

    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v3, v3, 0x300

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_f
    const/16 v2, 0x1a

    if-lt v1, v2, :cond_10

    invoke-static {p0, p1, v0}, Lh/e$o;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    :cond_10
    iget v2, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, 0xf

    iget v3, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v3, 0xf

    if-eq v2, v4, :cond_11

    iget v2, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v3, v3, 0xf

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->uiMode:I

    :cond_11
    iget v2, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, 0x30

    iget v3, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v3, 0x30

    if-eq v2, v4, :cond_12

    iget v2, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v3, v3, 0x30

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->uiMode:I

    :cond_12
    iget v2, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v3, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    if-eq v2, v3, :cond_13

    iput v3, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    :cond_13
    iget v2, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v3, p1, Landroid/content/res/Configuration;->screenHeightDp:I

    if-eq v2, v3, :cond_14

    iput v3, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    :cond_14
    iget v2, p0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    iget v3, p1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    if-eq v2, v3, :cond_15

    iput v3, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    :cond_15
    const/16 v2, 0x11

    if-lt v1, v2, :cond_16

    invoke-static {p0, p1, v0}, Lh/e$l;->b(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    :cond_16
    :goto_1
    return-object v0
.end method


# virtual methods
.method public A(I)Z
    .locals 4

    invoke-virtual {p0, p1}, Lh/e;->G0(I)I

    move-result p1

    iget-boolean v0, p0, Lh/e;->L:Z

    const/4 v1, 0x0

    const/16 v2, 0x6c

    if-eqz v0, :cond_0

    if-ne p1, v2, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lh/e;->H:Z

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    if-ne p1, v3, :cond_1

    iput-boolean v1, p0, Lh/e;->H:Z

    :cond_1
    if-eq p1, v3, :cond_7

    const/4 v0, 0x2

    if-eq p1, v0, :cond_6

    const/4 v0, 0x5

    if-eq p1, v0, :cond_5

    const/16 v0, 0xa

    if-eq p1, v0, :cond_4

    if-eq p1, v2, :cond_3

    const/16 v0, 0x6d

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0}, Lh/e;->K0()V

    iput-boolean v3, p0, Lh/e;->I:Z

    return v3

    :cond_3
    invoke-virtual {p0}, Lh/e;->K0()V

    iput-boolean v3, p0, Lh/e;->H:Z

    return v3

    :cond_4
    invoke-virtual {p0}, Lh/e;->K0()V

    iput-boolean v3, p0, Lh/e;->J:Z

    return v3

    :cond_5
    invoke-virtual {p0}, Lh/e;->K0()V

    iput-boolean v3, p0, Lh/e;->G:Z

    return v3

    :cond_6
    invoke-virtual {p0}, Lh/e;->K0()V

    iput-boolean v3, p0, Lh/e;->F:Z

    return v3

    :cond_7
    invoke-virtual {p0}, Lh/e;->K0()V

    iput-boolean v3, p0, Lh/e;->L:Z

    return v3
.end method

.method public A0(Landroid/view/ViewGroup;)V
    .locals 0

    return-void
.end method

.method public final B0(Lh/e$v;Landroid/view/KeyEvent;)V
    .locals 13

    iget-boolean v0, p1, Lh/e$v;->o:Z

    if-nez v0, :cond_10

    iget-boolean v0, p0, Lh/e;->S:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget v0, p1, Lh/e$v;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v3, 0x4

    if-ne v0, v3, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lh/e;->j0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lh/e$v;->a:I

    iget-object v4, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v3, v4}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1, v2}, Lh/e;->S(Lh/e$v;Z)V

    return-void

    :cond_3
    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    const-string v3, "window"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-nez v0, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0, p1, p2}, Lh/e;->E0(Lh/e$v;Landroid/view/KeyEvent;)Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    :cond_5
    iget-object p2, p1, Lh/e$v;->g:Landroid/view/ViewGroup;

    const/4 v3, -0x1

    const/4 v4, -0x2

    if-eqz p2, :cond_7

    iget-boolean v5, p1, Lh/e$v;->q:Z

    if-eqz v5, :cond_6

    goto :goto_1

    :cond_6
    iget-object p2, p1, Lh/e$v;->i:Landroid/view/View;

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_e

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne p2, v3, :cond_e

    move v6, v3

    goto :goto_2

    :cond_7
    :goto_1
    if-nez p2, :cond_9

    invoke-virtual {p0, p1}, Lh/e;->m0(Lh/e$v;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p1, Lh/e$v;->g:Landroid/view/ViewGroup;

    if-nez p2, :cond_a

    :cond_8
    return-void

    :cond_9
    iget-boolean v3, p1, Lh/e$v;->q:Z

    if-eqz v3, :cond_a

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_a

    iget-object p2, p1, Lh/e$v;->g:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_a
    invoke-virtual {p0, p1}, Lh/e;->l0(Lh/e$v;)Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-virtual {p1}, Lh/e$v;->b()Z

    move-result p2

    if-nez p2, :cond_b

    goto :goto_3

    :cond_b
    iget-object p2, p1, Lh/e$v;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_c

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_c
    iget v3, p1, Lh/e$v;->b:I

    iget-object v5, p1, Lh/e$v;->g:Landroid/view/ViewGroup;

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    iget-object v3, p1, Lh/e$v;->h:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v5, v3, Landroid/view/ViewGroup;

    if-eqz v5, :cond_d

    check-cast v3, Landroid/view/ViewGroup;

    iget-object v5, p1, Lh/e$v;->h:Landroid/view/View;

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_d
    iget-object v3, p1, Lh/e$v;->g:Landroid/view/ViewGroup;

    iget-object v5, p1, Lh/e$v;->h:Landroid/view/View;

    invoke-virtual {v3, v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lh/e$v;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    move-result p2

    if-nez p2, :cond_e

    iget-object p2, p1, Lh/e$v;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    :cond_e
    move v6, v4

    :goto_2
    iput-boolean v1, p1, Lh/e$v;->n:Z

    new-instance p2, Landroid/view/WindowManager$LayoutParams;

    const/4 v7, -0x2

    iget v8, p1, Lh/e$v;->d:I

    iget v9, p1, Lh/e$v;->e:I

    const/16 v10, 0x3ea

    const/high16 v11, 0x820000

    const/4 v12, -0x3

    move-object v5, p2

    invoke-direct/range {v5 .. v12}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget v1, p1, Lh/e$v;->c:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v1, p1, Lh/e$v;->f:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object v1, p1, Lh/e$v;->g:Landroid/view/ViewGroup;

    invoke-interface {v0, v1, p2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v2, p1, Lh/e$v;->o:Z

    return-void

    :cond_f
    :goto_3
    iput-boolean v2, p1, Lh/e$v;->q:Z

    :cond_10
    :goto_4
    return-void
.end method

.method public C(I)V
    .locals 2

    invoke-virtual {p0}, Lh/e;->a0()V

    iget-object v0, p0, Lh/e;->C:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, Lh/e;->n:Lh/e$p;

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lh/e$p;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final C0()Lh/a;
    .locals 1

    iget-object v0, p0, Lh/e;->p:Lh/a;

    return-object v0
.end method

.method public D(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lh/e;->a0()V

    iget-object v0, p0, Lh/e;->C:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lh/e;->n:Lh/e$p;

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lh/e$p;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final D0(Lh/e$v;ILandroid/view/KeyEvent;I)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lh/e$v;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, Lh/e;->E0(Lh/e$v;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2, p3, p4}, Landroidx/appcompat/view/menu/e;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p2, 0x1

    and-int/lit8 p3, p4, 0x1

    if-nez p3, :cond_3

    iget-object p3, p0, Lh/e;->s:Ln/f0;

    if-nez p3, :cond_3

    invoke-virtual {p0, p1, p2}, Lh/e;->S(Lh/e$v;Z)V

    :cond_3
    return v1
.end method

.method public E(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lh/e;->a0()V

    iget-object v0, p0, Lh/e;->C:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lh/e;->n:Lh/e$p;

    iget-object p2, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lh/e$p;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final E0(Lh/e$v;Landroid/view/KeyEvent;)Z
    .locals 8

    iget-boolean v0, p0, Lh/e;->S:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lh/e$v;->m:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lh/e;->O:Lh/e$v;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    invoke-virtual {p0, v0, v1}, Lh/e;->S(Lh/e$v;Z)V

    :cond_2
    invoke-virtual {p0}, Lh/e;->j0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lh/e$v;->a:I

    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p1, Lh/e$v;->i:Landroid/view/View;

    :cond_3
    iget v3, p1, Lh/e$v;->a:I

    if-eqz v3, :cond_5

    const/16 v4, 0x6c

    if-ne v3, v4, :cond_4

    goto :goto_0

    :cond_4
    move v3, v1

    goto :goto_1

    :cond_5
    :goto_0
    move v3, v2

    :goto_1
    if-eqz v3, :cond_6

    iget-object v4, p0, Lh/e;->s:Ln/f0;

    if-eqz v4, :cond_6

    invoke-interface {v4}, Ln/f0;->c()V

    :cond_6
    iget-object v4, p1, Lh/e$v;->i:Landroid/view/View;

    if-nez v4, :cond_15

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lh/e;->C0()Lh/a;

    move-result-object v4

    instance-of v4, v4, Lh/k;

    if-nez v4, :cond_15

    :cond_7
    iget-object v4, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    iget-boolean v6, p1, Lh/e$v;->r:Z

    if-eqz v6, :cond_f

    :cond_8
    if-nez v4, :cond_a

    invoke-virtual {p0, p1}, Lh/e;->n0(Lh/e$v;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    if-nez v4, :cond_a

    :cond_9
    return v1

    :cond_a
    if-eqz v3, :cond_c

    iget-object v4, p0, Lh/e;->s:Ln/f0;

    if-eqz v4, :cond_c

    iget-object v4, p0, Lh/e;->t:Lh/e$j;

    if-nez v4, :cond_b

    new-instance v4, Lh/e$j;

    invoke-direct {v4, p0}, Lh/e$j;-><init>(Lh/e;)V

    iput-object v4, p0, Lh/e;->t:Lh/e$j;

    :cond_b
    iget-object v4, p0, Lh/e;->s:Ln/f0;

    iget-object v6, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    iget-object v7, p0, Lh/e;->t:Lh/e$j;

    invoke-interface {v4, v6, v7}, Ln/f0;->a(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_c
    iget-object v4, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->d0()V

    iget v4, p1, Lh/e$v;->a:I

    iget-object v6, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, v6}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_e

    invoke-virtual {p1, v5}, Lh/e$v;->c(Landroidx/appcompat/view/menu/e;)V

    if-eqz v3, :cond_d

    iget-object p1, p0, Lh/e;->s:Ln/f0;

    if-eqz p1, :cond_d

    iget-object p2, p0, Lh/e;->t:Lh/e$j;

    invoke-interface {p1, v5, p2}, Ln/f0;->a(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_d
    return v1

    :cond_e
    iput-boolean v1, p1, Lh/e$v;->r:Z

    :cond_f
    iget-object v4, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->d0()V

    iget-object v4, p1, Lh/e$v;->s:Landroid/os/Bundle;

    if-eqz v4, :cond_10

    iget-object v6, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v6, v4}, Landroidx/appcompat/view/menu/e;->P(Landroid/os/Bundle;)V

    iput-object v5, p1, Lh/e$v;->s:Landroid/os/Bundle;

    :cond_10
    iget-object v4, p1, Lh/e$v;->i:Landroid/view/View;

    iget-object v6, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v1, v4, v6}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_12

    if-eqz v3, :cond_11

    iget-object p2, p0, Lh/e;->s:Ln/f0;

    if-eqz p2, :cond_11

    iget-object v0, p0, Lh/e;->t:Lh/e$j;

    invoke-interface {p2, v5, v0}, Ln/f0;->a(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_11
    iget-object p1, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->c0()V

    return v1

    :cond_12
    if-eqz p2, :cond_13

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_2

    :cond_13
    const/4 p2, -0x1

    :goto_2
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v2, :cond_14

    move p2, v2

    goto :goto_3

    :cond_14
    move p2, v1

    :goto_3
    iput-boolean p2, p1, Lh/e$v;->p:Z

    iget-object v0, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v0, p2}, Landroidx/appcompat/view/menu/e;->setQwertyMode(Z)V

    iget-object p2, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p2}, Landroidx/appcompat/view/menu/e;->c0()V

    :cond_15
    iput-boolean v2, p1, Lh/e$v;->m:Z

    iput-boolean v1, p1, Lh/e$v;->n:Z

    iput-object p1, p0, Lh/e;->O:Lh/e$v;

    return v2
.end method

.method public F(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    iget-object v0, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object v0

    instance-of v1, v0, Lh/n;

    if-nez v1, :cond_3

    const/4 v1, 0x0

    iput-object v1, p0, Lh/e;->q:Landroid/view/MenuInflater;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lh/a;->p()V

    :cond_1
    iput-object v1, p0, Lh/e;->p:Lh/a;

    if-eqz p1, :cond_2

    new-instance v0, Lh/k;

    invoke-virtual {p0}, Lh/e;->i0()Ljava/lang/CharSequence;

    move-result-object v1

    iget-object v2, p0, Lh/e;->n:Lh/e$p;

    invoke-direct {v0, p1, v1, v2}, Lh/k;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V

    iput-object v0, p0, Lh/e;->p:Lh/a;

    iget-object p1, p0, Lh/e;->n:Lh/e$p;

    iget-object v0, v0, Lh/k;->c:Lh/e$i;

    invoke-virtual {p1, v0}, Lh/e$p;->e(Lh/e$i;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lh/e;->n:Lh/e$p;

    invoke-virtual {p1, v1}, Lh/e$p;->e(Lh/e$i;)V

    :goto_0
    invoke-virtual {p0}, Lh/e;->p()V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final F0(Z)V
    .locals 5

    iget-object v0, p0, Lh/e;->s:Ln/f0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ln/f0;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh/e;->s:Ln/f0;

    invoke-interface {v0}, Ln/f0;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_0
    invoke-virtual {p0}, Lh/e;->j0()Landroid/view/Window$Callback;

    move-result-object v0

    iget-object v3, p0, Lh/e;->s:Ln/f0;

    invoke-interface {v3}, Ln/f0;->b()Z

    move-result v3

    const/16 v4, 0x6c

    if-eqz v3, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lh/e;->s:Ln/f0;

    invoke-interface {p1}, Ln/f0;->g()Z

    iget-boolean p1, p0, Lh/e;->S:Z

    if-nez p1, :cond_4

    invoke-virtual {p0, v2, v1}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object p1

    iget-object p1, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_1

    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    iget-boolean p1, p0, Lh/e;->S:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lh/e;->a0:Z

    if-eqz p1, :cond_3

    iget p1, p0, Lh/e;->b0:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v3, p0, Lh/e;->c0:Ljava/lang/Runnable;

    invoke-virtual {p1, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Lh/e;->c0:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_3
    invoke-virtual {p0, v2, v1}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object p1

    iget-object v1, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v1, :cond_4

    iget-boolean v3, p1, Lh/e$v;->r:Z

    if-nez v3, :cond_4

    iget-object v3, p1, Lh/e$v;->i:Landroid/view/View;

    invoke-interface {v0, v2, v3, v1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p1, p0, Lh/e;->s:Ln/f0;

    invoke-interface {p1}, Ln/f0;->h()Z

    :cond_4
    :goto_1
    return-void

    :cond_5
    invoke-virtual {p0, v2, v1}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object p1

    iput-boolean v1, p1, Lh/e$v;->q:Z

    invoke-virtual {p0, p1, v2}, Lh/e;->S(Lh/e$v;Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lh/e;->B0(Lh/e$v;Landroid/view/KeyEvent;)V

    return-void
.end method

.method public G(I)V
    .locals 0

    iput p1, p0, Lh/e;->V:I

    return-void
.end method

.method public final G0(I)I
    .locals 2

    const-string v0, "AppCompatDelegate"

    const/16 v1, 0x8

    if-ne p1, v1, :cond_0

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6c

    return p1

    :cond_0
    const/16 v1, 0x9

    if-ne p1, v1, :cond_1

    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 p1, 0x6d

    :cond_1
    return p1
.end method

.method public final H(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Lh/e;->r:Ljava/lang/CharSequence;

    iget-object v0, p0, Lh/e;->s:Ln/f0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ln/f0;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lh/e;->C0()Lh/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lh/e;->C0()Lh/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh/a;->y(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lh/e;->D:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final H0()Z
    .locals 1

    iget-boolean v0, p0, Lh/e;->B:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh/e;->C:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lk0/b0;->G(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public I(Ll/b$a;)Ll/b;
    .locals 2

    if-eqz p1, :cond_3

    iget-object v0, p0, Lh/e;->v:Ll/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/b;->c()V

    :cond_0
    new-instance v0, Lh/e$k;

    invoke-direct {v0, p0, p1}, Lh/e$k;-><init>(Lh/e;Ll/b$a;)V

    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lh/a;->A(Ll/b$a;)Ll/b;

    move-result-object p1

    iput-object p1, p0, Lh/e;->v:Ll/b;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lh/e;->o:Lh/c;

    if-eqz v1, :cond_1

    invoke-interface {v1, p1}, Lh/c;->onSupportActionModeStarted(Ll/b;)V

    :cond_1
    iget-object p1, p0, Lh/e;->v:Ll/b;

    if-nez p1, :cond_2

    invoke-virtual {p0, v0}, Lh/e;->J0(Ll/b$a;)Ll/b;

    move-result-object p1

    iput-object p1, p0, Lh/e;->v:Ll/b;

    :cond_2
    iget-object p1, p0, Lh/e;->v:Ll/b;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ActionMode callback can not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final I0(Landroid/view/ViewParent;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    if-eq p1, v1, :cond_3

    instance-of v2, p1, Landroid/view/View;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Lk0/b0;->F(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public J()Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lh/e;->K(Z)Z

    move-result v0

    return v0
.end method

.method public J0(Ll/b$a;)Ll/b;
    .locals 7

    invoke-virtual {p0}, Lh/e;->Z()V

    iget-object v0, p0, Lh/e;->v:Ll/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/b;->c()V

    :cond_0
    instance-of v0, p1, Lh/e$k;

    if-nez v0, :cond_1

    new-instance v0, Lh/e$k;

    invoke-direct {v0, p0, p1}, Lh/e$k;-><init>(Lh/e;Ll/b$a;)V

    move-object p1, v0

    :cond_1
    iget-object v0, p0, Lh/e;->o:Lh/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lh/e;->S:Z

    if-nez v2, :cond_2

    :try_start_0
    invoke-interface {v0, p1}, Lh/c;->onWindowStartingSupportActionMode(Ll/b$a;)Ll/b;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_3

    iput-object v0, p0, Lh/e;->v:Ll/b;

    goto/16 :goto_5

    :cond_3
    iget-object v0, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lh/e;->K:Z

    if-eqz v0, :cond_5

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v4, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    sget v5, Lg/a;->f:I

    invoke-virtual {v4, v5, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v5, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_4

    iget-object v5, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v4, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v5, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v4, Ll/d;

    iget-object v6, p0, Lh/e;->l:Landroid/content/Context;

    invoke-direct {v4, v6, v2}, Ll/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    goto :goto_1

    :cond_4
    iget-object v4, p0, Lh/e;->l:Landroid/content/Context;

    :goto_1
    new-instance v5, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {v5, v4}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    new-instance v5, Landroid/widget/PopupWindow;

    sget v6, Lg/a;->i:I

    invoke-direct {v5, v4, v1, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v5, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    const/4 v6, 0x2

    invoke-static {v5, v6}, Ln0/i;->b(Landroid/widget/PopupWindow;I)V

    iget-object v5, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    iget-object v6, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v5, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    sget v6, Lg/a;->b:I

    invoke-virtual {v5, v6, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v0

    iget-object v4, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    iget-object v0, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    const/4 v4, -0x2

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance v0, Lh/e$f;

    invoke-direct {v0, p0}, Lh/e$f;-><init>(Lh/e;)V

    iput-object v0, p0, Lh/e;->y:Ljava/lang/Runnable;

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lh/e;->C:Landroid/view/ViewGroup;

    sget v4, Lg/f;->h:I

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lh/e;->e0()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    invoke-virtual {v0}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    :cond_6
    :goto_2
    iget-object v0, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lh/e;->Z()V

    iget-object v0, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    new-instance v0, Ll/e;

    iget-object v4, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v6, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    if-nez v6, :cond_7

    goto :goto_3

    :cond_7
    move v3, v2

    :goto_3
    invoke-direct {v0, v4, v5, p1, v3}, Ll/e;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Ll/b$a;Z)V

    invoke-virtual {v0}, Ll/b;->e()Landroid/view/Menu;

    move-result-object v3

    invoke-interface {p1, v0, v3}, Ll/b$a;->a(Ll/b;Landroid/view/Menu;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v0}, Ll/b;->k()V

    iget-object p1, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->h(Ll/b;)V

    iput-object v0, p0, Lh/e;->v:Ll/b;

    invoke-virtual {p0}, Lh/e;->H0()Z

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_8

    iget-object p1, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {p1}, Lk0/b0;->c(Landroid/view/View;)Lk0/h0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lk0/h0;->b(F)Lk0/h0;

    move-result-object p1

    iput-object p1, p0, Lh/e;->z:Lk0/h0;

    new-instance v0, Lh/e$g;

    invoke-direct {v0, p0}, Lh/e$g;-><init>(Lh/e;)V

    invoke-virtual {p1, v0}, Lk0/h0;->h(Lk0/i0;)Lk0/h0;

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lk0/b0;->T(Landroid/view/View;)V

    :cond_9
    :goto_4
    iget-object p1, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_b

    iget-object p1, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lh/e;->y:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    :cond_a
    iput-object v1, p0, Lh/e;->v:Ll/b;

    :cond_b
    :goto_5
    iget-object p1, p0, Lh/e;->v:Ll/b;

    if-eqz p1, :cond_c

    iget-object v0, p0, Lh/e;->o:Lh/c;

    if-eqz v0, :cond_c

    invoke-interface {v0, p1}, Lh/c;->onSupportActionModeStarted(Ll/b;)V

    :cond_c
    iget-object p1, p0, Lh/e;->v:Ll/b;

    return-object p1
.end method

.method public final K(Z)Z
    .locals 2

    iget-boolean v0, p0, Lh/e;->S:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lh/e;->N()I

    move-result v0

    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {p0, v1, v0}, Lh/e;->r0(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p0, v1, p1}, Lh/e;->M0(IZ)Z

    move-result p1

    if-nez v0, :cond_1

    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {p0, v1}, Lh/e;->g0(Landroid/content/Context;)Lh/e$r;

    move-result-object v1

    invoke-virtual {v1}, Lh/e$r;->e()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lh/e;->Y:Lh/e$r;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lh/e$r;->a()V

    :cond_2
    :goto_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lh/e;->f0(Landroid/content/Context;)Lh/e$r;

    move-result-object v0

    invoke-virtual {v0}, Lh/e$r;->e()V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lh/e;->Z:Lh/e$r;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lh/e$r;->a()V

    :cond_4
    :goto_1
    return p1
.end method

.method public final K0()V
    .locals 2

    iget-boolean v0, p0, Lh/e;->B:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final L()V
    .locals 5

    iget-object v0, p0, Lh/e;->C:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v1, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    invoke-virtual {v0, v2, v3, v4, v1}, Landroidx/appcompat/widget/ContentFrameLayout;->b(IIII)V

    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    sget-object v2, Lg/j;->y0:[I

    invoke-virtual {v1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Lg/j;->K0:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v2, Lg/j;->L0:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v2, Lg/j;->I0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_0
    sget v2, Lg/j;->J0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_1
    sget v2, Lg/j;->G0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_2
    sget v2, Lg/j;->H0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_3
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public final L0()Landroidx/appcompat/app/b;
    .locals 3

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v2, v0, Landroidx/appcompat/app/b;

    if-eqz v2, :cond_0

    check-cast v0, Landroidx/appcompat/app/b;

    return-object v0

    :cond_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final M(Landroid/view/Window;)V
    .locals 3

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    const-string v1, "AppCompat has already installed itself into the Window"

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v2, v0, Lh/e$p;

    if-nez v2, :cond_1

    new-instance v1, Lh/e$p;

    invoke-direct {v1, p0, v0}, Lh/e$p;-><init>(Lh/e;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Lh/e;->n:Lh/e$p;

    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    const/4 v1, 0x0

    sget-object v2, Lh/e;->k0:[I

    invoke-static {v0, v1, v2}, Ln/w0;->t(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ln/w0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln/w0;->g(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {v0}, Ln/w0;->v()V

    iput-object p1, p0, Lh/e;->m:Landroid/view/Window;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final M0(IZ)Z
    .locals 7

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, p1, v1, v2}, Lh/e;->T(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v3, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {p0, v3}, Lh/e;->p0(Landroid/content/Context;)Z

    move-result v3

    iget-object v4, p0, Lh/e;->T:Landroid/content/res/Configuration;

    if-nez v4, :cond_0

    iget-object v4, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    :cond_0
    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, 0x30

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/4 v5, 0x1

    if-eq v4, v0, :cond_2

    if-eqz p2, :cond_2

    if-nez v3, :cond_2

    iget-boolean p2, p0, Lh/e;->Q:Z

    if-eqz p2, :cond_2

    sget-boolean p2, Lh/e;->l0:Z

    if-nez p2, :cond_1

    iget-boolean p2, p0, Lh/e;->R:Z

    if-eqz p2, :cond_2

    :cond_1
    iget-object p2, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v6, p2, Landroid/app/Activity;

    if-eqz v6, :cond_2

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/app/Activity;->isChild()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lh/e;->k:Ljava/lang/Object;

    check-cast p2, Landroid/app/Activity;

    invoke-static {p2}, Lx/b;->f(Landroid/app/Activity;)V

    move v2, v5

    :cond_2
    if-nez v2, :cond_3

    if-eq v4, v0, :cond_3

    invoke-virtual {p0, v0, v3, v1}, Lh/e;->N0(IZLandroid/content/res/Configuration;)V

    goto :goto_0

    :cond_3
    move v5, v2

    :goto_0
    if-eqz v5, :cond_4

    iget-object p2, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v0, p2, Landroidx/appcompat/app/b;

    if-eqz v0, :cond_4

    check-cast p2, Landroidx/appcompat/app/b;

    invoke-virtual {p2, p1}, Landroidx/appcompat/app/b;->onNightModeChanged(I)V

    :cond_4
    return v5
.end method

.method public final N()I
    .locals 2

    iget v0, p0, Lh/e;->U:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lh/d;->j()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final N0(IZLandroid/content/res/Configuration;)V
    .locals 3

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    if-eqz p3, :cond_0

    invoke-virtual {v1, p3}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    :cond_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    iget p3, p3, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p3, p3, -0x31

    or-int/2addr p1, p3

    iput p1, v1, Landroid/content/res/Configuration;->uiMode:I

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-ge p1, p3, :cond_1

    invoke-static {v0}, Lh/j;->a(Landroid/content/res/Resources;)V

    :cond_1
    iget p3, p0, Lh/e;->V:I

    if-eqz p3, :cond_2

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v0, p3}, Landroid/content/Context;->setTheme(I)V

    const/16 p3, 0x17

    if-lt p1, p3, :cond_2

    iget-object p1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    iget p3, p0, Lh/e;->V:I

    const/4 v0, 0x1

    invoke-virtual {p1, p3, v0}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_2
    if-eqz p2, :cond_4

    iget-object p1, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of p2, p1, Landroid/app/Activity;

    if-eqz p2, :cond_4

    check-cast p1, Landroid/app/Activity;

    instance-of p2, p1, Landroidx/lifecycle/k;

    if-eqz p2, :cond_3

    move-object p2, p1

    check-cast p2, Landroidx/lifecycle/k;

    invoke-interface {p2}, Landroidx/lifecycle/k;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/f;->b()Landroidx/lifecycle/f$b;

    move-result-object p2

    sget-object p3, Landroidx/lifecycle/f$b;->j:Landroidx/lifecycle/f$b;

    invoke-virtual {p2, p3}, Landroidx/lifecycle/f$b;->c(Landroidx/lifecycle/f$b;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_0

    :cond_3
    iget-boolean p2, p0, Lh/e;->R:Z

    if-eqz p2, :cond_4

    iget-boolean p2, p0, Lh/e;->S:Z

    if-nez p2, :cond_4

    :goto_0
    invoke-virtual {p1, v1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    :cond_4
    return-void
.end method

.method public O(ILh/e$v;Landroid/view/Menu;)V
    .locals 2

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lh/e;->N:[Lh/e$v;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p2, v0, p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p3, p2, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    :cond_1
    if-eqz p2, :cond_2

    iget-boolean p2, p2, Lh/e$v;->o:Z

    if-nez p2, :cond_2

    return-void

    :cond_2
    iget-boolean p2, p0, Lh/e;->S:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Lh/e;->n:Lh/e$p;

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p2, v0, p1, p3}, Lh/e$p;->d(Landroid/view/Window$Callback;ILandroid/view/Menu;)V

    :cond_3
    return-void
.end method

.method public final O0(Lk0/l0;Landroid/graphics/Rect;)I
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lk0/l0;->k()I

    move-result v1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget v1, p2, Landroid/graphics/Rect;->top:I

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    iget-object v2, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v3, 0x8

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    instance-of v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_10

    iget-object v2, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v4, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->isShown()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_e

    iget-object v4, p0, Lh/e;->e0:Landroid/graphics/Rect;

    if-nez v4, :cond_2

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Lh/e;->e0:Landroid/graphics/Rect;

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Lh/e;->f0:Landroid/graphics/Rect;

    :cond_2
    iget-object v4, p0, Lh/e;->e0:Landroid/graphics/Rect;

    iget-object v6, p0, Lh/e;->f0:Landroid/graphics/Rect;

    if-nez p1, :cond_3

    invoke-virtual {v4, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lk0/l0;->i()I

    move-result p2

    invoke-virtual {p1}, Lk0/l0;->k()I

    move-result v7

    invoke-virtual {p1}, Lk0/l0;->j()I

    move-result v8

    invoke-virtual {p1}, Lk0/l0;->h()I

    move-result p1

    invoke-virtual {v4, p2, v7, v8, p1}, Landroid/graphics/Rect;->set(IIII)V

    :goto_1
    iget-object p1, p0, Lh/e;->C:Landroid/view/ViewGroup;

    invoke-static {p1, v4, v6}, Ln/e1;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget p1, v4, Landroid/graphics/Rect;->top:I

    iget p2, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    iget-object v6, p0, Lh/e;->C:Landroid/view/ViewGroup;

    invoke-static {v6}, Lk0/b0;->y(Landroid/view/View;)Lk0/l0;

    move-result-object v6

    if-nez v6, :cond_4

    move v7, v0

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lk0/l0;->i()I

    move-result v7

    :goto_2
    if-nez v6, :cond_5

    move v6, v0

    goto :goto_3

    :cond_5
    invoke-virtual {v6}, Lk0/l0;->j()I

    move-result v6

    :goto_3
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v8, p1, :cond_7

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v8, p2, :cond_7

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v8, v4, :cond_6

    goto :goto_4

    :cond_6
    move p2, v0

    goto :goto_5

    :cond_7
    :goto_4
    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput p2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move p2, v5

    :goto_5
    if-lez p1, :cond_8

    iget-object p1, p0, Lh/e;->E:Landroid/view/View;

    if-nez p1, :cond_8

    new-instance p1, Landroid/view/View;

    iget-object v4, p0, Lh/e;->l:Landroid/content/Context;

    invoke-direct {p1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lh/e;->E:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/16 v8, 0x33

    const/4 v9, -0x1

    invoke-direct {p1, v9, v4, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    iput v7, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v6, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget-object v4, p0, Lh/e;->C:Landroid/view/ViewGroup;

    iget-object v6, p0, Lh/e;->E:Landroid/view/View;

    invoke-virtual {v4, v6, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_6

    :cond_8
    iget-object p1, p0, Lh/e;->E:Landroid/view/View;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v4, v8, :cond_9

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v4, v7, :cond_9

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v4, v6, :cond_a

    :cond_9
    iput v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v7, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v4, p0, Lh/e;->E:Landroid/view/View;

    invoke-virtual {v4, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_a
    :goto_6
    iget-object p1, p0, Lh/e;->E:Landroid/view/View;

    if-eqz p1, :cond_b

    goto :goto_7

    :cond_b
    move v5, v0

    :goto_7
    if-eqz v5, :cond_c

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lh/e;->E:Landroid/view/View;

    invoke-virtual {p0, p1}, Lh/e;->P0(Landroid/view/View;)V

    :cond_c
    iget-boolean p1, p0, Lh/e;->J:Z

    if-nez p1, :cond_d

    if-eqz v5, :cond_d

    move v1, v0

    :cond_d
    move p1, v5

    move v5, p2

    goto :goto_8

    :cond_e
    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz p1, :cond_f

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move p1, v0

    goto :goto_8

    :cond_f
    move p1, v0

    move v5, p1

    :goto_8
    if-eqz v5, :cond_11

    iget-object p2, p0, Lh/e;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_9

    :cond_10
    move p1, v0

    :cond_11
    :goto_9
    iget-object p2, p0, Lh/e;->E:Landroid/view/View;

    if-eqz p2, :cond_13

    if-eqz p1, :cond_12

    goto :goto_a

    :cond_12
    move v0, v3

    :goto_a
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_13
    return v1
.end method

.method public P(Landroidx/appcompat/view/menu/e;)V
    .locals 2

    iget-boolean v0, p0, Lh/e;->M:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/e;->M:Z

    iget-object v0, p0, Lh/e;->s:Ln/f0;

    invoke-interface {v0}, Ln/f0;->j()V

    invoke-virtual {p0}, Lh/e;->j0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lh/e;->S:Z

    if-nez v1, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lh/e;->M:Z

    return-void
.end method

.method public final P0(Landroid/view/View;)V
    .locals 2

    invoke-static {p1}, Lk0/b0;->B(Landroid/view/View;)I

    move-result v0

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    sget v1, Lg/c;->b:I

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    sget v1, Lg/c;->a:I

    :goto_1
    invoke-static {v0, v1}, Ly/a;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public final Q()V
    .locals 1

    iget-object v0, p0, Lh/e;->Y:Lh/e$r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/e$r;->a()V

    :cond_0
    iget-object v0, p0, Lh/e;->Z:Lh/e$r;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lh/e$r;->a()V

    :cond_1
    return-void
.end method

.method public R(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lh/e;->S(Lh/e$v;Z)V

    return-void
.end method

.method public S(Lh/e$v;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget v0, p1, Lh/e$v;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/e;->s:Ln/f0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln/f0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p0, p1}, Lh/e;->P(Landroidx/appcompat/view/menu/e;)V

    return-void

    :cond_0
    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v2, p1, Lh/e$v;->o:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Lh/e$v;->g:Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    iget p2, p1, Lh/e$v;->a:I

    invoke-virtual {p0, p2, p1, v1}, Lh/e;->O(ILh/e$v;Landroid/view/Menu;)V

    :cond_1
    const/4 p2, 0x0

    iput-boolean p2, p1, Lh/e$v;->m:Z

    iput-boolean p2, p1, Lh/e$v;->n:Z

    iput-boolean p2, p1, Lh/e$v;->o:Z

    iput-object v1, p1, Lh/e$v;->h:Landroid/view/View;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lh/e$v;->q:Z

    iget-object p2, p0, Lh/e;->O:Lh/e$v;

    if-ne p2, p1, :cond_2

    iput-object v1, p0, Lh/e;->O:Lh/e$v;

    :cond_2
    return-void
.end method

.method public final T(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    goto :goto_0

    :cond_1
    const/16 p1, 0x20

    goto :goto_0

    :cond_2
    const/16 p1, 0x10

    :goto_0
    new-instance p2, Landroid/content/res/Configuration;

    invoke-direct {p2}, Landroid/content/res/Configuration;-><init>()V

    const/4 p4, 0x0

    iput p4, p2, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p3, :cond_3

    invoke-virtual {p2, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_3
    iget p3, p2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p3, p3, -0x31

    or-int/2addr p1, p3

    iput p1, p2, Landroid/content/res/Configuration;->uiMode:I

    return-object p2
.end method

.method public final U()Landroid/view/ViewGroup;
    .locals 7

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    sget-object v1, Lg/j;->y0:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lg/j;->D0:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_12

    sget v2, Lg/j;->M0:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0, v4}, Lh/e;->A(I)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x6c

    invoke-virtual {p0, v1}, Lh/e;->A(I)Z

    :cond_1
    :goto_0
    sget v1, Lg/j;->E0:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v2, 0x6d

    if-eqz v1, :cond_2

    invoke-virtual {p0, v2}, Lh/e;->A(I)Z

    :cond_2
    sget v1, Lg/j;->F0:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Lh/e;->A(I)Z

    :cond_3
    sget v1, Lg/j;->z0:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lh/e;->K:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Lh/e;->b0()V

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Lh/e;->L:Z

    const/4 v5, 0x0

    if-nez v1, :cond_9

    iget-boolean v1, p0, Lh/e;->K:Z

    if-eqz v1, :cond_4

    sget v1, Lg/g;->f:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-boolean v3, p0, Lh/e;->I:Z

    iput-boolean v3, p0, Lh/e;->H:Z

    goto/16 :goto_3

    :cond_4
    iget-boolean v0, p0, Lh/e;->H:Z

    if-eqz v0, :cond_8

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v6, Lg/a;->f:I

    invoke-virtual {v1, v6, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v1, :cond_5

    new-instance v1, Ll/d;

    iget-object v4, p0, Lh/e;->l:Landroid/content/Context;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v1, v4, v0}, Ll/d;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    :goto_1
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lg/g;->p:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Lg/f;->p:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ln/f0;

    iput-object v1, p0, Lh/e;->s:Ln/f0;

    invoke-virtual {p0}, Lh/e;->j0()Landroid/view/Window$Callback;

    move-result-object v4

    invoke-interface {v1, v4}, Ln/f0;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v1, p0, Lh/e;->I:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Lh/e;->s:Ln/f0;

    invoke-interface {v1, v2}, Ln/f0;->i(I)V

    :cond_6
    iget-boolean v1, p0, Lh/e;->F:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lh/e;->s:Ln/f0;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Ln/f0;->i(I)V

    :cond_7
    iget-boolean v1, p0, Lh/e;->G:Z

    if-eqz v1, :cond_b

    iget-object v1, p0, Lh/e;->s:Ln/f0;

    const/4 v2, 0x5

    invoke-interface {v1, v2}, Ln/f0;->i(I)V

    goto :goto_3

    :cond_8
    move-object v0, v5

    goto :goto_3

    :cond_9
    iget-boolean v1, p0, Lh/e;->J:Z

    if-eqz v1, :cond_a

    sget v1, Lg/g;->o:I

    goto :goto_2

    :cond_a
    sget v1, Lg/g;->n:I

    :goto_2
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    :cond_b
    :goto_3
    if-eqz v0, :cond_11

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_c

    new-instance v1, Lh/e$c;

    invoke-direct {v1, p0}, Lh/e$c;-><init>(Lh/e;)V

    invoke-static {v0, v1}, Lk0/b0;->g0(Landroid/view/View;Lk0/v;)V

    goto :goto_4

    :cond_c
    instance-of v1, v0, Landroidx/appcompat/widget/b;

    if-eqz v1, :cond_d

    move-object v1, v0

    check-cast v1, Landroidx/appcompat/widget/b;

    new-instance v2, Lh/e$d;

    invoke-direct {v2, p0}, Lh/e$d;-><init>(Lh/e;)V

    invoke-interface {v1, v2}, Landroidx/appcompat/widget/b;->setOnFitSystemWindowsListener(Landroidx/appcompat/widget/b$a;)V

    :cond_d
    :goto_4
    iget-object v1, p0, Lh/e;->s:Ln/f0;

    if-nez v1, :cond_e

    sget v1, Lg/f;->M:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lh/e;->D:Landroid/widget/TextView;

    :cond_e
    invoke-static {v0}, Ln/e1;->c(Landroid/view/View;)V

    sget v1, Lg/f;->b:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v2, p0, Lh/e;->m:Landroid/view/Window;

    const v4, 0x1020002

    invoke-virtual {v2, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    if-eqz v2, :cond_10

    :goto_5
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-lez v6, :cond_f

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v1, v6}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_5

    :cond_f
    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setId(I)V

    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setId(I)V

    instance-of v3, v2, Landroid/widget/FrameLayout;

    if-eqz v3, :cond_10

    check-cast v2, Landroid/widget/FrameLayout;

    invoke-virtual {v2, v5}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_10
    iget-object v2, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v2, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    new-instance v2, Lh/e$e;

    invoke-direct {v2, p0}, Lh/e$e;-><init>(Lh/e;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V

    return-object v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lh/e;->H:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lh/e;->I:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lh/e;->K:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lh/e;->J:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lh/e;->L:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public V(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 11

    iget-object v0, p0, Lh/e;->g0:Lh/h;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    sget-object v2, Lg/j;->y0:[I

    invoke-virtual {v0, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v2, Lg/j;->C0:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lh/h;

    invoke-direct {v0}, Lh/h;-><init>()V

    :goto_0
    iput-object v0, p0, Lh/e;->g0:Lh/h;

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v2, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh/h;

    iput-object v2, p0, Lh/e;->g0:Lh/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to instantiate custom view inflater "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Falling back to default."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "AppCompatDelegate"

    invoke-static {v3, v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Lh/h;

    invoke-direct {v0}, Lh/h;-><init>()V

    goto :goto_0

    :cond_1
    :goto_1
    sget-boolean v8, Lh/e;->j0:Z

    const/4 v0, 0x1

    if-eqz v8, :cond_5

    iget-object v2, p0, Lh/e;->h0:Lh/i;

    if-nez v2, :cond_2

    new-instance v2, Lh/i;

    invoke-direct {v2}, Lh/i;-><init>()V

    iput-object v2, p0, Lh/e;->h0:Lh/i;

    :cond_2
    iget-object v2, p0, Lh/e;->h0:Lh/i;

    invoke-virtual {v2, p4}, Lh/i;->a(Landroid/util/AttributeSet;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v7, v0

    goto :goto_3

    :cond_3
    instance-of v2, p4, Lorg/xmlpull/v1/XmlPullParser;

    if-eqz v2, :cond_4

    move-object v2, p4

    check-cast v2, Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    if-le v2, v0, :cond_5

    goto :goto_2

    :cond_4
    move-object v0, p1

    check-cast v0, Landroid/view/ViewParent;

    invoke-virtual {p0, v0}, Lh/e;->I0(Landroid/view/ViewParent;)Z

    move-result v0

    :goto_2
    move v1, v0

    :cond_5
    move v7, v1

    :goto_3
    iget-object v2, p0, Lh/e;->g0:Lh/h;

    const/4 v9, 0x1

    invoke-static {}, Ln/d1;->d()Z

    move-result v10

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v10}, Lh/h;->r(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public W()V
    .locals 2

    iget-object v0, p0, Lh/e;->s:Ln/f0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln/f0;->j()V

    :cond_0
    iget-object v0, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lh/e;->y:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lh/e;->x:Landroid/widget/PopupWindow;

    :cond_2
    invoke-virtual {p0}, Lh/e;->Z()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v0, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->close()V

    :cond_3
    return-void
.end method

.method public X(Landroid/view/KeyEvent;)Z
    .locals 3

    iget-object v0, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v1, v0, Lk0/f$a;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    instance-of v0, v0, Lh/g;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lk0/f;->d(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x52

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lh/e;->n:Lh/e$p;

    iget-object v1, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lh/e$p;->b(Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    invoke-virtual {p0, v0, p1}, Lh/e;->t0(ILandroid/view/KeyEvent;)Z

    move-result p1

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v0, p1}, Lh/e;->w0(ILandroid/view/KeyEvent;)Z

    move-result p1

    :goto_1
    return p1
.end method

.method public Y(I)V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object v1

    iget-object v2, v1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v2, :cond_1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-object v3, v1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v3, v2}, Landroidx/appcompat/view/menu/e;->Q(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Landroid/os/Bundle;->size()I

    move-result v3

    if-lez v3, :cond_0

    iput-object v2, v1, Lh/e$v;->s:Landroid/os/Bundle;

    :cond_0
    iget-object v2, v1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->d0()V

    iget-object v2, v1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->clear()V

    :cond_1
    iput-boolean v0, v1, Lh/e$v;->r:Z

    iput-boolean v0, v1, Lh/e$v;->q:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Lh/e;->s:Ln/f0;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object v0

    if-eqz v0, :cond_3

    iput-boolean p1, v0, Lh/e$v;->m:Z

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Lh/e;->E0(Lh/e$v;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method public Z()V
    .locals 1

    iget-object v0, p0, Lh/e;->z:Lk0/h0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk0/h0;->c()V

    :cond_0
    return-void
.end method

.method public a(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .locals 2

    invoke-virtual {p0}, Lh/e;->j0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lh/e;->S:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->D()Landroidx/appcompat/view/menu/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lh/e;->c0(Landroid/view/Menu;)Lh/e$v;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Lh/e$v;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final a0()V
    .locals 2

    iget-boolean v0, p0, Lh/e;->B:Z

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lh/e;->U()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lh/e;->C:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lh/e;->i0()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lh/e;->s:Ln/f0;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Ln/f0;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lh/e;->C0()Lh/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lh/e;->C0()Lh/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lh/a;->y(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lh/e;->D:Landroid/widget/TextView;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lh/e;->L()V

    iget-object v0, p0, Lh/e;->C:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Lh/e;->A0(Landroid/view/ViewGroup;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/e;->B:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object v0

    iget-boolean v1, p0, Lh/e;->S:Z

    if-nez v1, :cond_4

    if-eqz v0, :cond_3

    iget-object v0, v0, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    if-nez v0, :cond_4

    :cond_3
    const/16 v0, 0x6c

    invoke-virtual {p0, v0}, Lh/e;->o0(I)V

    :cond_4
    return-void
.end method

.method public b(Landroidx/appcompat/view/menu/e;)V
    .locals 0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lh/e;->F0(Z)V

    return-void
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0, v0}, Lh/e;->M(Landroid/view/Window;)V

    :cond_0
    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c0(Landroid/view/Menu;)Lh/e$v;
    .locals 5

    iget-object v0, p0, Lh/e;->N:[Lh/e$v;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    iget-object v4, v3, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    if-ne v4, p1, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lh/e;->a0()V

    iget-object v0, p0, Lh/e;->C:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lh/e;->n:Lh/e$p;

    iget-object p2, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lh/e$p;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final e0()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/a;->k()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    :cond_1
    return-object v0
.end method

.method public f(Landroid/content/Context;)Landroid/content/Context;
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/e;->Q:Z

    invoke-virtual {p0}, Lh/e;->N()I

    move-result v1

    invoke-virtual {p0, p1, v1}, Lh/e;->r0(Landroid/content/Context;I)I

    move-result v1

    sget-boolean v2, Lh/e;->m0:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    instance-of v2, p1, Landroid/view/ContextThemeWrapper;

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1, v1, v3, v4}, Lh/e;->T(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v2

    :try_start_0
    move-object v5, p1

    check-cast v5, Landroid/view/ContextThemeWrapper;

    invoke-static {v5, v2}, Lh/e$t;->a(Landroid/view/ContextThemeWrapper;Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_0
    instance-of v2, p1, Ll/d;

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, v1, v3, v4}, Lh/e;->T(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v2

    :try_start_1
    move-object v5, p1

    check-cast v5, Ll/d;

    invoke-virtual {v5, v2}, Ll/d;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    :cond_1
    sget-boolean v2, Lh/e;->l0:Z

    if-nez v2, :cond_2

    invoke-super {p0, p1}, Lh/d;->f(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    return-object p1

    :cond_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x11

    if-lt v2, v5, :cond_3

    new-instance v2, Landroid/content/res/Configuration;

    invoke-direct {v2}, Landroid/content/res/Configuration;-><init>()V

    const/4 v5, -0x1

    iput v5, v2, Landroid/content/res/Configuration;->uiMode:I

    const/4 v5, 0x0

    iput v5, v2, Landroid/content/res/Configuration;->fontScale:F

    invoke-static {p1, v2}, Lh/e$l;->a(Landroid/content/Context;Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget v6, v5, Landroid/content/res/Configuration;->uiMode:I

    iput v6, v2, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {v2, v5}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-static {v2, v5}, Lh/e;->d0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v3

    :cond_3
    invoke-virtual {p0, p1, v1, v3, v0}, Lh/e;->T(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v1

    new-instance v2, Ll/d;

    sget v3, Lg/i;->d:I

    invoke-direct {v2, p1, v3}, Ll/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v1}, Ll/d;->a(Landroid/content/res/Configuration;)V

    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    move v0, v4

    :goto_0
    move v4, v0

    :catch_2
    if-eqz v4, :cond_5

    invoke-virtual {v2}, Ll/d;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-static {p1}, Lz/h$g;->a(Landroid/content/res/Resources$Theme;)V

    :cond_5
    invoke-super {p0, v2}, Lh/d;->f(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method public final f0(Landroid/content/Context;)Lh/e$r;
    .locals 1

    iget-object v0, p0, Lh/e;->Z:Lh/e$r;

    if-nez v0, :cond_0

    new-instance v0, Lh/e$q;

    invoke-direct {v0, p0, p1}, Lh/e$q;-><init>(Lh/e;Landroid/content/Context;)V

    iput-object v0, p0, Lh/e;->Z:Lh/e$r;

    :cond_0
    iget-object p1, p0, Lh/e;->Z:Lh/e$r;

    return-object p1
.end method

.method public final g0(Landroid/content/Context;)Lh/e$r;
    .locals 1

    iget-object v0, p0, Lh/e;->Y:Lh/e$r;

    if-nez v0, :cond_0

    new-instance v0, Lh/e$s;

    invoke-static {p1}, Lh/m;->a(Landroid/content/Context;)Lh/m;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lh/e$s;-><init>(Lh/e;Lh/m;)V

    iput-object v0, p0, Lh/e;->Y:Lh/e$r;

    :cond_0
    iget-object p1, p0, Lh/e;->Y:Lh/e$r;

    return-object p1
.end method

.method public h0(IZ)Lh/e$v;
    .locals 3

    iget-object p2, p0, Lh/e;->N:[Lh/e$v;

    if-eqz p2, :cond_0

    array-length v0, p2

    if-gt v0, p1, :cond_2

    :cond_0
    add-int/lit8 v0, p1, 0x1

    new-array v0, v0, [Lh/e$v;

    if-eqz p2, :cond_1

    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v0, p0, Lh/e;->N:[Lh/e$v;

    move-object p2, v0

    :cond_2
    aget-object v0, p2, p1

    if-nez v0, :cond_3

    new-instance v0, Lh/e$v;

    invoke-direct {v0, p1}, Lh/e$v;-><init>(I)V

    aput-object v0, p2, p1

    :cond_3
    return-object v0
.end method

.method public i(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lh/e;->a0()V

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final i0()Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lh/e;->r:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final j0()Landroid/view/Window$Callback;
    .locals 1

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lh/b;
    .locals 1

    new-instance v0, Lh/e$h;

    invoke-direct {v0, p0}, Lh/e$h;-><init>(Lh/e;)V

    return-object v0
.end method

.method public final k0()V
    .locals 3

    invoke-virtual {p0}, Lh/e;->a0()V

    iget-boolean v0, p0, Lh/e;->H:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lh/e;->p:Lh/a;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    new-instance v0, Lh/n;

    iget-object v1, p0, Lh/e;->k:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget-boolean v2, p0, Lh/e;->I:Z

    invoke-direct {v0, v1, v2}, Lh/n;-><init>(Landroid/app/Activity;Z)V

    :goto_0
    iput-object v0, p0, Lh/e;->p:Lh/a;

    goto :goto_1

    :cond_1
    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_2

    new-instance v0, Lh/n;

    iget-object v1, p0, Lh/e;->k:Ljava/lang/Object;

    check-cast v1, Landroid/app/Dialog;

    invoke-direct {v0, v1}, Lh/n;-><init>(Landroid/app/Dialog;)V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lh/e;->p:Lh/a;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Lh/e;->d0:Z

    invoke-virtual {v0, v1}, Lh/a;->u(Z)V

    :cond_3
    :goto_2
    return-void
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lh/e;->U:I

    return v0
.end method

.method public final l0(Lh/e$v;)Z
    .locals 3

    iget-object v0, p1, Lh/e$v;->i:Landroid/view/View;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object v0, p1, Lh/e$v;->h:Landroid/view/View;

    return v1

    :cond_0
    iget-object v0, p1, Lh/e$v;->j:Landroidx/appcompat/view/menu/e;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lh/e;->u:Lh/e$w;

    if-nez v0, :cond_2

    new-instance v0, Lh/e$w;

    invoke-direct {v0, p0}, Lh/e$w;-><init>(Lh/e;)V

    iput-object v0, p0, Lh/e;->u:Lh/e$w;

    :cond_2
    iget-object v0, p0, Lh/e;->u:Lh/e$w;

    invoke-virtual {p1, v0}, Lh/e$v;->a(Landroidx/appcompat/view/menu/i$a;)Landroidx/appcompat/view/menu/j;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iput-object v0, p1, Lh/e$v;->h:Landroid/view/View;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    move v1, v2

    :goto_0
    return v1
.end method

.method public m()Landroid/view/MenuInflater;
    .locals 2

    iget-object v0, p0, Lh/e;->q:Landroid/view/MenuInflater;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lh/e;->k0()V

    new-instance v0, Ll/g;

    iget-object v1, p0, Lh/e;->p:Lh/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lh/a;->k()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    :goto_0
    invoke-direct {v0, v1}, Ll/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lh/e;->q:Landroid/view/MenuInflater;

    :cond_1
    iget-object v0, p0, Lh/e;->q:Landroid/view/MenuInflater;

    return-object v0
.end method

.method public final m0(Lh/e$v;)Z
    .locals 2

    invoke-virtual {p0}, Lh/e;->e0()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lh/e$v;->d(Landroid/content/Context;)V

    new-instance v0, Lh/e$u;

    iget-object v1, p1, Lh/e$v;->l:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lh/e$u;-><init>(Lh/e;Landroid/content/Context;)V

    iput-object v0, p1, Lh/e$v;->g:Landroid/view/ViewGroup;

    const/16 v0, 0x51

    iput v0, p1, Lh/e$v;->c:I

    const/4 p1, 0x1

    return p1
.end method

.method public n()Lh/a;
    .locals 1

    invoke-virtual {p0}, Lh/e;->k0()V

    iget-object v0, p0, Lh/e;->p:Lh/a;

    return-object v0
.end method

.method public final n0(Lh/e$v;)Z
    .locals 6

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    iget v1, p1, Lh/e$v;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/16 v3, 0x6c

    if-ne v1, v3, :cond_4

    :cond_0
    iget-object v1, p0, Lh/e;->s:Ln/f0;

    if-eqz v1, :cond_4

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, Lg/a;->f:I

    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    const/4 v4, 0x0

    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v5, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    sget v5, Lg/a;->g:I

    invoke-virtual {v4, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_0

    :cond_1
    sget v5, Lg/a;->g:I

    invoke-virtual {v3, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    :goto_0
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_3

    if-nez v4, :cond_2

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_2
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_3
    if-eqz v4, :cond_4

    new-instance v1, Ll/d;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Ll/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v0, v1

    :cond_4
    new-instance v1, Landroidx/appcompat/view/menu/e;

    invoke-direct {v1, v0}, Landroidx/appcompat/view/menu/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Landroidx/appcompat/view/menu/e;->R(Landroidx/appcompat/view/menu/e$a;)V

    invoke-virtual {p1, v1}, Lh/e$v;->c(Landroidx/appcompat/view/menu/e;)V

    return v2
.end method

.method public o()V
    .locals 2

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {v0, p0}, Lk0/g;->b(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Lh/e;

    if-nez v0, :cond_1

    const-string v0, "AppCompatDelegate"

    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public final o0(I)V
    .locals 2

    iget v0, p0, Lh/e;->b0:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Lh/e;->b0:I

    iget-boolean p1, p0, Lh/e;->a0:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lh/e;->c0:Ljava/lang/Runnable;

    invoke-static {p1, v0}, Lk0/b0;->R(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-boolean v1, p0, Lh/e;->a0:Z

    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lh/e;->V(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lh/e;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public p()V
    .locals 1

    invoke-virtual {p0}, Lh/e;->C0()Lh/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object v0

    invoke-virtual {v0}, Lh/a;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lh/e;->o0(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final p0(Landroid/content/Context;)Z
    .locals 6

    iget-boolean v0, p0, Lh/e;->X:Z

    const/4 v1, 0x1

    if-nez v0, :cond_4

    iget-object v0, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    :cond_0
    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_1

    const/high16 v3, 0x100c0000

    goto :goto_0

    :cond_1
    const/16 v4, 0x18

    if-lt v3, v4, :cond_2

    const/high16 v3, 0xc0000

    goto :goto_0

    :cond_2
    move v3, v2

    :goto_0
    new-instance v4, Landroid/content/ComponentName;

    iget-object v5, p0, Lh/e;->k:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-direct {v4, p1, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object p1

    if-eqz p1, :cond_3

    iget p1, p1, Landroid/content/pm/ActivityInfo;->configChanges:I

    and-int/lit16 p1, p1, 0x200

    if-eqz p1, :cond_3

    move p1, v1

    goto :goto_1

    :cond_3
    move p1, v2

    :goto_1
    iput-boolean p1, p0, Lh/e;->W:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string v0, "AppCompatDelegate"

    const-string v3, "Exception while getting ActivityInfo"

    invoke-static {v0, v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-boolean v2, p0, Lh/e;->W:Z

    :cond_4
    :goto_2
    iput-boolean v1, p0, Lh/e;->X:Z

    iget-boolean p1, p0, Lh/e;->W:Z

    return p1
.end method

.method public q(Landroid/content/res/Configuration;)V
    .locals 2

    iget-boolean v0, p0, Lh/e;->H:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lh/e;->B:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lh/a;->o(Landroid/content/res/Configuration;)V

    :cond_0
    invoke-static {}, Ln/j;->b()Ln/j;

    move-result-object v0

    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ln/j;->g(Landroid/content/Context;)V

    new-instance v0, Landroid/content/res/Configuration;

    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p0, Lh/e;->T:Landroid/content/res/Configuration;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lh/e;->K(Z)Z

    iget-object v0, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    return-void
.end method

.method public q0()Z
    .locals 1

    iget-boolean v0, p0, Lh/e;->A:Z

    return v0
.end method

.method public r(Landroid/os/Bundle;)V
    .locals 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh/e;->Q:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lh/e;->K(Z)Z

    invoke-virtual {p0}, Lh/e;->b0()V

    iget-object v0, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    :try_start_0
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lx/j;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lh/e;->C0()Lh/a;

    move-result-object v0

    if-nez v0, :cond_0

    iput-boolean p1, p0, Lh/e;->d0:Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lh/a;->u(Z)V

    :cond_1
    :goto_0
    invoke-static {p0}, Lh/d;->c(Lh/d;)V

    :cond_2
    new-instance v0, Landroid/content/res/Configuration;

    iget-object v1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p0, Lh/e;->T:Landroid/content/res/Configuration;

    iput-boolean p1, p0, Lh/e;->R:Z

    return-void
.end method

.method public r0(Landroid/content/Context;I)I
    .locals 2

    const/16 v0, -0x64

    const/4 v1, -0x1

    if-eq p2, v0, :cond_4

    if-eq p2, v1, :cond_3

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Lh/e;->f0(Landroid/content/Context;)Lh/e$r;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lh/e$r;->c()I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "uimode"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/UiModeManager;

    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    move-result p2

    if-nez p2, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0, p1}, Lh/e;->g0(Landroid/content/Context;)Lh/e$r;

    move-result-object p1

    goto :goto_0

    :cond_3
    return p2

    :cond_4
    return v1
.end method

.method public s()V
    .locals 3

    iget-object v0, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lh/d;->y(Lh/d;)V

    :cond_0
    iget-boolean v0, p0, Lh/e;->a0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh/e;->m:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lh/e;->c0:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lh/e;->S:Z

    iget v0, p0, Lh/e;->U:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lh/e;->k:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lh/e;->i0:Lu/g;

    iget-object v1, p0, Lh/e;->k:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lh/e;->U:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lu/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object v0, Lh/e;->i0:Lu/g;

    iget-object v1, p0, Lh/e;->k:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lh/e;->p:Lh/a;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lh/a;->p()V

    :cond_3
    invoke-virtual {p0}, Lh/e;->Q()V

    return-void
.end method

.method public s0()Z
    .locals 2

    iget-object v0, p0, Lh/e;->v:Ll/b;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/b;->c()V

    return v1

    :cond_0
    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lh/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public t(Landroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p0}, Lh/e;->a0()V

    return-void
.end method

.method public t0(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v2, p2}, Lh/e;->u0(ILandroid/view/KeyEvent;)Z

    return v1

    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    iput-boolean v1, p0, Lh/e;->P:Z

    :goto_1
    return v2
.end method

.method public u()V
    .locals 2

    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lh/a;->w(Z)V

    :cond_0
    return-void
.end method

.method public final u0(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object p1

    iget-boolean v0, p1, Lh/e$v;->o:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lh/e;->E0(Lh/e$v;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public v(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public v0(ILandroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lh/a;->q(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lh/e;->O:Lh/e$v;

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0, p1, v0, p2, v1}, Lh/e;->D0(Lh/e$v;ILandroid/view/KeyEvent;I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh/e;->O:Lh/e$v;

    if-eqz p1, :cond_1

    iput-boolean v1, p1, Lh/e$v;->n:Z

    :cond_1
    return v1

    :cond_2
    iget-object p1, p0, Lh/e;->O:Lh/e$v;

    const/4 v0, 0x0

    if-nez p1, :cond_3

    invoke-virtual {p0, v0, v1}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lh/e;->E0(Lh/e$v;Landroid/view/KeyEvent;)Z

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-virtual {p0, p1, v2, p2, v1}, Lh/e;->D0(Lh/e$v;ILandroid/view/KeyEvent;I)Z

    move-result p2

    iput-boolean v0, p1, Lh/e$v;->m:Z

    if-eqz p2, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public w()V
    .locals 0

    invoke-virtual {p0}, Lh/e;->J()Z

    return-void
.end method

.method public w0(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2, p2}, Lh/e;->x0(ILandroid/view/KeyEvent;)Z

    return v1

    :cond_1
    iget-boolean p1, p0, Lh/e;->P:Z

    iput-boolean v2, p0, Lh/e;->P:Z

    invoke-virtual {p0, v2, v2}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-boolean v0, p2, Lh/e$v;->o:Z

    if-eqz v0, :cond_3

    if-nez p1, :cond_2

    invoke-virtual {p0, p2, v1}, Lh/e;->S(Lh/e$v;Z)V

    :cond_2
    return v1

    :cond_3
    invoke-virtual {p0}, Lh/e;->s0()Z

    move-result p1

    if-eqz p1, :cond_4

    return v1

    :cond_4
    :goto_0
    return v2
.end method

.method public x()V
    .locals 2

    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh/a;->w(Z)V

    :cond_0
    return-void
.end method

.method public final x0(ILandroid/view/KeyEvent;)Z
    .locals 4

    iget-object v0, p0, Lh/e;->v:Ll/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object v2

    if-nez p1, :cond_2

    iget-object p1, p0, Lh/e;->s:Ln/f0;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ln/f0;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lh/e;->s:Ln/f0;

    invoke-interface {p1}, Ln/f0;->b()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lh/e;->S:Z

    if-nez p1, :cond_5

    invoke-virtual {p0, v2, p2}, Lh/e;->E0(Lh/e$v;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lh/e;->s:Ln/f0;

    invoke-interface {p1}, Ln/f0;->h()Z

    move-result v0

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lh/e;->s:Ln/f0;

    invoke-interface {p1}, Ln/f0;->g()Z

    move-result v0

    goto :goto_2

    :cond_2
    iget-boolean p1, v2, Lh/e$v;->o:Z

    if-nez p1, :cond_6

    iget-boolean v3, v2, Lh/e$v;->n:Z

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean p1, v2, Lh/e$v;->m:Z

    if-eqz p1, :cond_5

    iget-boolean p1, v2, Lh/e$v;->r:Z

    if-eqz p1, :cond_4

    iput-boolean v1, v2, Lh/e$v;->m:Z

    invoke-virtual {p0, v2, p2}, Lh/e;->E0(Lh/e$v;Landroid/view/KeyEvent;)Z

    move-result p1

    goto :goto_0

    :cond_4
    move p1, v0

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p0, v2, p2}, Lh/e;->B0(Lh/e$v;Landroid/view/KeyEvent;)V

    goto :goto_2

    :cond_5
    move v0, v1

    goto :goto_2

    :cond_6
    :goto_1
    invoke-virtual {p0, v2, v0}, Lh/e;->S(Lh/e$v;Z)V

    move v0, p1

    :goto_2
    if-eqz v0, :cond_8

    iget-object p1, p0, Lh/e;->l:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "audio"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    goto :goto_3

    :cond_7
    const-string p1, "AppCompatDelegate"

    const-string p2, "Couldn\'t get audio manager"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    :goto_3
    return v0
.end method

.method public y0(I)V
    .locals 1

    const/16 v0, 0x6c

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lh/a;->i(Z)V

    :cond_0
    return-void
.end method

.method public z0(I)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x6c

    if-ne p1, v1, :cond_0

    invoke-virtual {p0}, Lh/e;->n()Lh/a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lh/a;->i(Z)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1}, Lh/e;->h0(IZ)Lh/e$v;

    move-result-object p1

    iget-boolean v1, p1, Lh/e$v;->o:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1, v0}, Lh/e;->S(Lh/e$v;Z)V

    :cond_1
    :goto_0
    return-void
.end method
