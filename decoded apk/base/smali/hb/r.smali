.class public Lhb/r;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:Landroid/view/WindowManager;

.field public c:Landroid/view/OrientationEventListener;

.field public d:Lhb/q;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lhb/r;)Landroid/view/WindowManager;
    .locals 0

    iget-object p0, p0, Lhb/r;->b:Landroid/view/WindowManager;

    return-object p0
.end method

.method public static synthetic b(Lhb/r;)Lhb/q;
    .locals 0

    iget-object p0, p0, Lhb/r;->d:Lhb/q;

    return-object p0
.end method

.method public static synthetic c(Lhb/r;)I
    .locals 0

    iget p0, p0, Lhb/r;->a:I

    return p0
.end method

.method public static synthetic d(Lhb/r;I)I
    .locals 0

    iput p1, p0, Lhb/r;->a:I

    return p1
.end method


# virtual methods
.method public e(Landroid/content/Context;Lhb/q;)V
    .locals 1

    invoke-virtual {p0}, Lhb/r;->f()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p2, p0, Lhb/r;->d:Lhb/q;

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    iput-object p2, p0, Lhb/r;->b:Landroid/view/WindowManager;

    new-instance p2, Lhb/r$a;

    const/4 v0, 0x3

    invoke-direct {p2, p0, p1, v0}, Lhb/r$a;-><init>(Lhb/r;Landroid/content/Context;I)V

    iput-object p2, p0, Lhb/r;->c:Landroid/view/OrientationEventListener;

    invoke-virtual {p2}, Landroid/view/OrientationEventListener;->enable()V

    iget-object p1, p0, Lhb/r;->b:Landroid/view/WindowManager;

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result p1

    iput p1, p0, Lhb/r;->a:I

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lhb/r;->c:Landroid/view/OrientationEventListener;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lhb/r;->c:Landroid/view/OrientationEventListener;

    iput-object v0, p0, Lhb/r;->b:Landroid/view/WindowManager;

    iput-object v0, p0, Lhb/r;->d:Lhb/q;

    return-void
.end method
