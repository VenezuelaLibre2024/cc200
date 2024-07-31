.class public Lbc/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lbc/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Landroid/media/MediaFormat;)Lvb/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/media/MediaFormat;",
            ">;",
            "Landroid/media/MediaFormat;",
            ")",
            "Lvb/c;"
        }
    .end annotation

    sget-object p1, Lvb/c;->i:Lvb/c;

    return-object p1
.end method
