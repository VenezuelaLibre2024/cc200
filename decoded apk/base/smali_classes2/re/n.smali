.class public interface abstract Lre/n;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lre/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/n$a;

    invoke-direct {v0}, Lre/n$a;-><init>()V

    sput-object v0, Lre/n;->a:Lre/n;

    return-void
.end method


# virtual methods
.method public abstract a(Lre/v;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lre/v;",
            ")",
            "Ljava/util/List<",
            "Lre/m;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lre/v;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lre/v;",
            "Ljava/util/List<",
            "Lre/m;",
            ">;)V"
        }
    .end annotation
.end method
