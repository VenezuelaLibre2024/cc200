.class public interface abstract Lxe/l;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lxe/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxe/l$a;

    invoke-direct {v0}, Lxe/l$a;-><init>()V

    sput-object v0, Lxe/l;->a:Lxe/l;

    return-void
.end method


# virtual methods
.method public abstract a(ILxe/b;)V
.end method

.method public abstract b(ILjava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lxe/c;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract c(ILjava/util/List;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lxe/c;",
            ">;Z)Z"
        }
    .end annotation
.end method

.method public abstract d(ILbf/e;IZ)Z
.end method
