.class public final Lgb/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lgb/d;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lgb/e$a;)V
    .locals 0

    invoke-direct {p0}, Lgb/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgb/d;Lgb/d;)I
    .locals 0

    invoke-virtual {p1}, Lgb/d;->i()F

    move-result p1

    invoke-virtual {p2}, Lgb/d;->i()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lgb/d;

    check-cast p2, Lgb/d;

    invoke-virtual {p0, p1, p2}, Lgb/e$b;->a(Lgb/d;Lgb/d;)I

    move-result p1

    return p1
.end method
