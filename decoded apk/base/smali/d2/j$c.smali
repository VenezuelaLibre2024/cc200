.class public Ld2/j$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroidx/work/ListenableWorker;

.field public c:Lk2/a;

.field public d:Lo2/a;

.field public e:Landroidx/work/a;

.field public f:Landroidx/work/impl/WorkDatabase;

.field public g:Ljava/lang/String;

.field public h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld2/e;",
            ">;"
        }
    .end annotation
.end field

.field public i:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Lo2/a;Lk2/a;Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/work/WorkerParameters$a;

    invoke-direct {v0}, Landroidx/work/WorkerParameters$a;-><init>()V

    iput-object v0, p0, Ld2/j$c;->i:Landroidx/work/WorkerParameters$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ld2/j$c;->a:Landroid/content/Context;

    iput-object p3, p0, Ld2/j$c;->d:Lo2/a;

    iput-object p4, p0, Ld2/j$c;->c:Lk2/a;

    iput-object p2, p0, Ld2/j$c;->e:Landroidx/work/a;

    iput-object p5, p0, Ld2/j$c;->f:Landroidx/work/impl/WorkDatabase;

    iput-object p6, p0, Ld2/j$c;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ld2/j;
    .locals 1

    new-instance v0, Ld2/j;

    invoke-direct {v0, p0}, Ld2/j;-><init>(Ld2/j$c;)V

    return-object v0
.end method

.method public b(Landroidx/work/WorkerParameters$a;)Ld2/j$c;
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Ld2/j$c;->i:Landroidx/work/WorkerParameters$a;

    :cond_0
    return-object p0
.end method

.method public c(Ljava/util/List;)Ld2/j$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld2/e;",
            ">;)",
            "Ld2/j$c;"
        }
    .end annotation

    iput-object p1, p0, Ld2/j$c;->h:Ljava/util/List;

    return-object p0
.end method
