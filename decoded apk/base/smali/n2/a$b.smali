.class public abstract Ln2/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ln2/a$a;)V
    .locals 0

    invoke-direct {p0}, Ln2/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ln2/a;Ln2/a$e;Ln2/a$e;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln2/a<",
            "*>;",
            "Ln2/a$e;",
            "Ln2/a$e;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract b(Ln2/a;Ljava/lang/Object;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln2/a<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract c(Ln2/a;Ln2/a$i;Ln2/a$i;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln2/a<",
            "*>;",
            "Ln2/a$i;",
            "Ln2/a$i;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract d(Ln2/a$i;Ln2/a$i;)V
.end method

.method public abstract e(Ln2/a$i;Ljava/lang/Thread;)V
.end method
