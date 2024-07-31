.class public Lo1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/c$c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/io/File;

.field public final c:Ls1/c$c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;Ls1/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/j;->a:Ljava/lang/String;

    iput-object p2, p0, Lo1/j;->b:Ljava/io/File;

    iput-object p3, p0, Lo1/j;->c:Ls1/c$c;

    return-void
.end method


# virtual methods
.method public a(Ls1/c$b;)Ls1/c;
    .locals 7

    new-instance v6, Lo1/i;

    iget-object v1, p1, Ls1/c$b;->a:Landroid/content/Context;

    iget-object v2, p0, Lo1/j;->a:Ljava/lang/String;

    iget-object v3, p0, Lo1/j;->b:Ljava/io/File;

    iget-object v0, p1, Ls1/c$b;->c:Ls1/c$a;

    iget v4, v0, Ls1/c$a;->a:I

    iget-object v0, p0, Lo1/j;->c:Ls1/c$c;

    invoke-interface {v0, p1}, Ls1/c$c;->a(Ls1/c$b;)Ls1/c;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lo1/i;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;ILs1/c;)V

    return-object v6
.end method
