.class public final Lce/j2$d;
.super Lhe/w$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lce/j2;->p(Ljava/lang/Object;Lce/o2;Lce/i2;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lce/j2;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhe/w;Lce/j2;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, Lce/j2$d;->d:Lce/j2;

    iput-object p3, p0, Lce/j2$d;->e:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lhe/w$a;-><init>(Lhe/w;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhe/w;

    invoke-virtual {p0, p1}, Lce/j2$d;->f(Lhe/w;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Lhe/w;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, Lce/j2$d;->d:Lce/j2;

    invoke-virtual {p1}, Lce/j2;->T()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lce/j2$d;->e:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-static {}, Lhe/v;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method
