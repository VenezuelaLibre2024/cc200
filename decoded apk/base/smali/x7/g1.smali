.class public final Lx7/g1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public volatile a:I

.field public final b:Lx7/t;

.field public volatile c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx7/t;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx7/g1;->c:Z

    iput v0, p0, Lx7/g1;->a:I

    iput-object p2, p0, Lx7/g1;->b:Lx7/t;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lg6/c;->c(Landroid/app/Application;)V

    invoke-static {}, Lg6/c;->b()Lg6/c;

    move-result-object p1

    new-instance p2, Lx7/f1;

    invoke-direct {p2, p0}, Lx7/f1;-><init>(Lx7/g1;)V

    invoke-virtual {p1, p2}, Lg6/c;->a(Lg6/c$a;)V

    return-void
.end method

.method public constructor <init>(Ln7/g;)V
    .locals 2

    invoke-virtual {p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lx7/t;

    invoke-direct {v1, p1}, Lx7/t;-><init>(Ln7/g;)V

    invoke-direct {p0, v0, v1}, Lx7/g1;-><init>(Landroid/content/Context;Lx7/t;)V

    return-void
.end method

.method public static bridge synthetic a(Lx7/g1;)Lx7/t;
    .locals 0

    iget-object p0, p0, Lx7/g1;->b:Lx7/t;

    return-object p0
.end method

.method public static bridge synthetic d(Lx7/g1;Z)V
    .locals 0

    iput-boolean p1, p0, Lx7/g1;->c:Z

    return-void
.end method

.method public static bridge synthetic f(Lx7/g1;)Z
    .locals 0

    invoke-virtual {p0}, Lx7/g1;->e()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-object v0, p0, Lx7/g1;->b:Lx7/t;

    invoke-virtual {v0}, Lx7/t;->b()V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/zzafm;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zza()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gtz v2, :cond_1

    const-wide/16 v0, 0xe10

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafm;->zzb()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    add-long/2addr v2, v0

    iget-object p1, p0, Lx7/g1;->b:Lx7/t;

    iput-wide v2, p1, Lx7/t;->b:J

    const-wide/16 v0, -0x1

    iput-wide v0, p1, Lx7/t;->c:J

    invoke-virtual {p0}, Lx7/g1;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lx7/g1;->b:Lx7/t;

    invoke-virtual {p1}, Lx7/t;->c()V

    :cond_2
    return-void
.end method

.method public final e()Z
    .locals 1

    iget v0, p0, Lx7/g1;->a:I

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lx7/g1;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
