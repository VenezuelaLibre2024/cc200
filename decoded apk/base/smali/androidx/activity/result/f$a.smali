.class public final Landroidx/activity/result/f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lf/d$f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lf/d$b;->a:Lf/d$b;

    iput-object v0, p0, Landroidx/activity/result/f$a;->a:Lf/d$f;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/activity/result/f;
    .locals 2

    new-instance v0, Landroidx/activity/result/f;

    invoke-direct {v0}, Landroidx/activity/result/f;-><init>()V

    iget-object v1, p0, Landroidx/activity/result/f$a;->a:Lf/d$f;

    invoke-virtual {v0, v1}, Landroidx/activity/result/f;->b(Lf/d$f;)V

    return-object v0
.end method

.method public final b(Lf/d$f;)Landroidx/activity/result/f$a;
    .locals 1

    const-string v0, "mediaType"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/activity/result/f$a;->a:Lf/d$f;

    return-object p0
.end method
