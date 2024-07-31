.class public final Lce/k1;
.super Lce/i2;
.source ""


# instance fields
.field public final l:Lce/i1;


# direct methods
.method public constructor <init>(Lce/i1;)V
    .locals 0

    invoke-direct {p0}, Lce/i2;-><init>()V

    iput-object p1, p0, Lce/k1;->l:Lce/i1;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lce/k1;->u(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Lce/k1;->l:Lce/i1;

    invoke-interface {p1}, Lce/i1;->dispose()V

    return-void
.end method
