.class public interface abstract Lx3/p;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lx3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lx3/o;->b:Lx3/o;

    sput-object v0, Lx3/p;->a:Lx3/p;

    return-void
.end method

.method public static synthetic a()[Lx3/k;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lx3/k;

    return-object v0
.end method

.method public static synthetic d()[Lx3/k;
    .locals 1

    invoke-static {}, Lx3/p;->a()[Lx3/k;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()[Lx3/k;
.end method

.method public c(Landroid/net/Uri;Ljava/util/Map;)[Lx3/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)[",
            "Lx3/k;"
        }
    .end annotation

    invoke-interface {p0}, Lx3/p;->b()[Lx3/k;

    move-result-object p1

    return-object p1
.end method
