.class public Lf6/e$a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf6/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lg6/t;

.field public b:Landroid/os/Looper;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lf6/e$a;
    .locals 4

    iget-object v0, p0, Lf6/e$a$a;->a:Lg6/t;

    if-nez v0, :cond_0

    new-instance v0, Lg6/a;

    invoke-direct {v0}, Lg6/a;-><init>()V

    iput-object v0, p0, Lf6/e$a$a;->a:Lg6/t;

    :cond_0
    iget-object v0, p0, Lf6/e$a$a;->b:Landroid/os/Looper;

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lf6/e$a$a;->b:Landroid/os/Looper;

    :cond_1
    new-instance v0, Lf6/e$a;

    iget-object v1, p0, Lf6/e$a$a;->a:Lg6/t;

    iget-object v2, p0, Lf6/e$a$a;->b:Landroid/os/Looper;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lf6/e$a;-><init>(Lg6/t;Landroid/accounts/Account;Landroid/os/Looper;Lf6/u;)V

    return-object v0
.end method

.method public b(Landroid/os/Looper;)Lf6/e$a$a;
    .locals 1

    const-string v0, "Looper must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lf6/e$a$a;->b:Landroid/os/Looper;

    return-object p0
.end method

.method public c(Lg6/t;)Lf6/e$a$a;
    .locals 1

    const-string v0, "StatusExceptionMapper must not be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lf6/e$a$a;->a:Lg6/t;

    return-object p0
.end method
