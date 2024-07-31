.class public interface abstract Lz4/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lz4/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz4/d;

    invoke-direct {v0}, Lz4/d;-><init>()V

    sput-object v0, Lz4/h;->a:Lz4/h;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/net/Uri;Ls3/m1;Ljava/util/List;Lp5/j0;Ljava/util/Map;Lx3/l;Lt3/s1;)Lz4/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ls3/m1;",
            "Ljava/util/List<",
            "Ls3/m1;",
            ">;",
            "Lp5/j0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lx3/l;",
            "Lt3/s1;",
            ")",
            "Lz4/k;"
        }
    .end annotation
.end method
