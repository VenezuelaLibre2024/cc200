.class public final Landroidx/work/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/util/concurrent/Executor;

.field public b:Lc2/v;

.field public c:Lc2/i;

.field public d:Ljava/util/concurrent/Executor;

.field public e:Lc2/q;

.field public f:Lc2/g;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Landroidx/work/a$b;->h:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/work/a$b;->i:I

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/work/a$b;->j:I

    const/16 v0, 0x14

    iput v0, p0, Landroidx/work/a$b;->k:I

    return-void
.end method


# virtual methods
.method public a()Landroidx/work/a;
    .locals 1

    new-instance v0, Landroidx/work/a;

    invoke-direct {v0, p0}, Landroidx/work/a;-><init>(Landroidx/work/a$b;)V

    return-object v0
.end method

.method public b(Ljava/util/concurrent/Executor;)Landroidx/work/a$b;
    .locals 0

    iput-object p1, p0, Landroidx/work/a$b;->a:Ljava/util/concurrent/Executor;

    return-object p0
.end method
