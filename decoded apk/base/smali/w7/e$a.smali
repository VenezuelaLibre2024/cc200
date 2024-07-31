.class public Lw7/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lw7/e$a;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(Lw7/x1;)V
    .locals 0

    invoke-direct {p0}, Lw7/e$a;-><init>()V

    return-void
.end method

.method public static bridge synthetic g(Lw7/e$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw7/e$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic h(Lw7/e$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw7/e$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic i(Lw7/e$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw7/e$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic j(Lw7/e$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw7/e$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic k(Lw7/e$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw7/e$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic l(Lw7/e$a;)Z
    .locals 0

    iget-boolean p0, p0, Lw7/e$a;->d:Z

    return p0
.end method

.method public static bridge synthetic m(Lw7/e$a;)Z
    .locals 0

    iget-boolean p0, p0, Lw7/e$a;->f:Z

    return p0
.end method


# virtual methods
.method public a()Lw7/e;
    .locals 2

    iget-object v0, p0, Lw7/e$a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Lw7/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw7/e;-><init>(Lw7/e$a;Lw7/d1;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ljava/lang/String;ZLjava/lang/String;)Lw7/e$a;
    .locals 0

    iput-object p1, p0, Lw7/e$a;->c:Ljava/lang/String;

    iput-boolean p2, p0, Lw7/e$a;->d:Z

    iput-object p3, p0, Lw7/e$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lw7/e$a;
    .locals 0

    iput-object p1, p0, Lw7/e$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public d(Z)Lw7/e$a;
    .locals 0

    iput-boolean p1, p0, Lw7/e$a;->f:Z

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lw7/e$a;
    .locals 0

    iput-object p1, p0, Lw7/e$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lw7/e$a;
    .locals 0

    iput-object p1, p0, Lw7/e$a;->a:Ljava/lang/String;

    return-object p0
.end method
