.class public Lk8/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lh8/j;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ld3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/g<",
            "Lg8/f0;",
            "[B>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lk8/e;

.field public final b:Ld3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/g<",
            "Lg8/f0;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh8/j;

    invoke-direct {v0}, Lh8/j;-><init>()V

    sput-object v0, Lk8/b;->c:Lh8/j;

    const-string v0, "hts/cahyiseot-agolai.o/1frlglgc/aclg"

    const-string v1, "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho"

    invoke-static {v0, v1}, Lk8/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lk8/b;->d:Ljava/lang/String;

    const-string v0, "AzSBpY4F0rHiHFdinTvM"

    const-string v1, "IayrSTFL9eJ69YeSUO2"

    invoke-static {v0, v1}, Lk8/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lk8/b;->e:Ljava/lang/String;

    sget-object v0, Lk8/a;->a:Lk8/a;

    sput-object v0, Lk8/b;->f:Ld3/g;

    return-void
.end method

.method public constructor <init>(Lk8/e;Ld3/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk8/e;",
            "Ld3/g<",
            "Lg8/f0;",
            "[B>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/b;->a:Lk8/e;

    iput-object p2, p0, Lk8/b;->b:Ld3/g;

    return-void
.end method

.method public static synthetic a(Lg8/f0;)[B
    .locals 0

    invoke-static {p0}, Lk8/b;->d(Lg8/f0;)[B

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Ll8/i;Le8/g0;)Lk8/b;
    .locals 4

    invoke-static {p0}, Lg3/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lg3/u;->c()Lg3/u;

    move-result-object p0

    new-instance v0, Le3/a;

    sget-object v1, Lk8/b;->d:Ljava/lang/String;

    sget-object v2, Lk8/b;->e:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Le3/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lg3/u;->g(Lg3/f;)Ld3/i;

    move-result-object p0

    const-class v0, Lg8/f0;

    const-string v1, "json"

    invoke-static {v1}, Ld3/c;->b(Ljava/lang/String;)Ld3/c;

    move-result-object v1

    sget-object v2, Lk8/b;->f:Ld3/g;

    const-string v3, "FIREBASE_CRASHLYTICS_REPORT"

    invoke-interface {p0, v3, v0, v1, v2}, Ld3/i;->a(Ljava/lang/String;Ljava/lang/Class;Ld3/c;Ld3/g;)Ld3/h;

    move-result-object p0

    new-instance v0, Lk8/e;

    invoke-interface {p1}, Ll8/i;->b()Ll8/d;

    move-result-object p1

    invoke-direct {v0, p0, p1, p2}, Lk8/e;-><init>(Ld3/h;Ll8/d;Le8/g0;)V

    new-instance p0, Lk8/b;

    invoke-direct {p0, v0, v2}, Lk8/b;-><init>(Lk8/e;Ld3/g;)V

    return-object p0
.end method

.method public static synthetic d(Lg8/f0;)[B
    .locals 1

    sget-object v0, Lk8/b;->c:Lh8/j;

    invoke-virtual {v0, p0}, Lh8/j;->M(Lg8/f0;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v1, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid input received"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Le8/u;Z)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le8/u;",
            "Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Le8/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk8/b;->a:Lk8/e;

    invoke-virtual {v0, p1, p2}, Lk8/e;->i(Le8/u;Z)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
