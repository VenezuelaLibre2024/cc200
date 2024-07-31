.class public final Li7/n$b;
.super Li7/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final d:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li7/n;-><init>(Li7/n$a;)V

    iput p1, p0, Li7/n$b;->d:I

    return-void
.end method


# virtual methods
.method public d(II)Li7/n;
    .locals 0

    return-object p0
.end method

.method public e(JJ)Li7/n;
    .locals 0

    return-object p0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Li7/n;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Li7/n;"
        }
    .end annotation

    return-object p0
.end method

.method public g(ZZ)Li7/n;
    .locals 0

    return-object p0
.end method

.method public h(ZZ)Li7/n;
    .locals 0

    return-object p0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Li7/n$b;->d:I

    return v0
.end method
