.class public Lib/q$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lib/q;->a(Ljava/util/List;Lhb/s;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lhb/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lhb/s;

.field public final synthetic i:Lib/q;


# direct methods
.method public constructor <init>(Lib/q;Lhb/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lib/q$a;->i:Lib/q;

    iput-object p2, p0, Lib/q$a;->h:Lhb/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lhb/s;Lhb/s;)I
    .locals 2

    iget-object v0, p0, Lib/q$a;->i:Lib/q;

    iget-object v1, p0, Lib/q$a;->h:Lhb/s;

    invoke-virtual {v0, p1, v1}, Lib/q;->c(Lhb/s;Lhb/s;)F

    move-result p1

    iget-object v0, p0, Lib/q$a;->i:Lib/q;

    iget-object v1, p0, Lib/q$a;->h:Lhb/s;

    invoke-virtual {v0, p2, v1}, Lib/q;->c(Lhb/s;Lhb/s;)F

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lhb/s;

    check-cast p2, Lhb/s;

    invoke-virtual {p0, p1, p2}, Lib/q$a;->a(Lhb/s;Lhb/s;)I

    move-result p1

    return p1
.end method
