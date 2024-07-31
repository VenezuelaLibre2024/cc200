.class public final Ltb/a$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltb/a;-><init>(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/a<",
        "Lgd/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Ltb/a;

.field public final synthetic i:Ljava/lang/Integer;

.field public final synthetic j:Ljava/lang/Integer;

.field public final synthetic k:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ltb/a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Ltb/a$a;->h:Ltb/a;

    iput-object p2, p0, Ltb/a$a;->i:Ljava/lang/Integer;

    iput-object p3, p0, Ltb/a$a;->j:Ljava/lang/Integer;

    iput-object p4, p0, Ltb/a$a;->k:Ljava/lang/Integer;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    iget-object v0, p0, Ltb/a$a;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltb/a$a;->j:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltb/a$a;->k:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltb/a$a;->h:Ltb/a;

    invoke-virtual {v0}, Ltb/a;->d()I

    move-result v1

    const/4 v2, 0x0

    iget-object v0, p0, Ltb/a$a;->k:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, p0, Ltb/a$a;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v0, p0, Ltb/a$a;->j:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x0

    iget-object v0, p0, Ltb/a$a;->k:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v8, 0x1401

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    :cond_0
    iget-object v0, p0, Ltb/a$a;->h:Ltb/a;

    invoke-virtual {v0}, Ltb/a;->d()I

    move-result v0

    const/16 v1, 0x2801

    const/16 v2, 0x2600

    int-to-float v2, v2

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    iget-object v0, p0, Ltb/a$a;->h:Ltb/a;

    invoke-virtual {v0}, Ltb/a;->d()I

    move-result v0

    const/16 v1, 0x2800

    const/16 v2, 0x2601

    int-to-float v2, v2

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    iget-object v0, p0, Ltb/a$a;->h:Ltb/a;

    invoke-virtual {v0}, Ltb/a;->d()I

    move-result v0

    const/16 v1, 0x2802

    const v2, 0x812f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    iget-object v0, p0, Ltb/a$a;->h:Ltb/a;

    invoke-virtual {v0}, Ltb/a;->d()I

    move-result v0

    const/16 v1, 0x2803

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const-string v0, "glTexParameter"

    invoke-static {v0}, Lob/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ltb/a$a;->a()V

    sget-object v0, Lgd/s;->a:Lgd/s;

    return-object v0
.end method
