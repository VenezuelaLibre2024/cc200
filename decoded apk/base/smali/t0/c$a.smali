.class public final Lt0/c$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt0/c;->c(Landroid/content/Context;Lyd/h;)Lr0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/a<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Lt0/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lt0/c;)V
    .locals 0

    iput-object p1, p0, Lt0/c$a;->h:Landroid/content/Context;

    iput-object p2, p0, Lt0/c$a;->i:Lt0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 2

    iget-object v0, p0, Lt0/c$a;->h:Landroid/content/Context;

    const-string v1, "applicationContext"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lt0/c$a;->i:Lt0/c;

    invoke-static {v1}, Lt0/c;->b(Lt0/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lt0/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt0/c$a;->a()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
