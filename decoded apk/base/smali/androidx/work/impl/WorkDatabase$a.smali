.class public Landroidx/work/impl/WorkDatabase$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/WorkDatabase;->s(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Landroidx/work/impl/WorkDatabase$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ls1/c$b;)Ls1/c;
    .locals 2

    iget-object v0, p0, Landroidx/work/impl/WorkDatabase$a;->a:Landroid/content/Context;

    invoke-static {v0}, Ls1/c$b;->a(Landroid/content/Context;)Ls1/c$b$a;

    move-result-object v0

    iget-object v1, p1, Ls1/c$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ls1/c$b$a;->c(Ljava/lang/String;)Ls1/c$b$a;

    move-result-object v1

    iget-object p1, p1, Ls1/c$b;->c:Ls1/c$a;

    invoke-virtual {v1, p1}, Ls1/c$b$a;->b(Ls1/c$a;)Ls1/c$b$a;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ls1/c$b$a;->d(Z)Ls1/c$b$a;

    new-instance p1, Lt1/c;

    invoke-direct {p1}, Lt1/c;-><init>()V

    invoke-virtual {v0}, Ls1/c$b$a;->a()Ls1/c$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lt1/c;->a(Ls1/c$b;)Ls1/c;

    move-result-object p1

    return-object p1
.end method
