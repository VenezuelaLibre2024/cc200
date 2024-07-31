.class public final Lce/j2$b;
.super Lce/i2;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce/j2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final l:Lce/j2;

.field public final m:Lce/j2$c;

.field public final n:Lce/v;

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lce/j2;Lce/j2$c;Lce/v;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lce/i2;-><init>()V

    iput-object p1, p0, Lce/j2$b;->l:Lce/j2;

    iput-object p2, p0, Lce/j2$b;->m:Lce/j2$c;

    iput-object p3, p0, Lce/j2$b;->n:Lce/v;

    iput-object p4, p0, Lce/j2$b;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lce/j2$b;->u(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, Lce/j2$b;->l:Lce/j2;

    iget-object v0, p0, Lce/j2$b;->m:Lce/j2$c;

    iget-object v1, p0, Lce/j2$b;->n:Lce/v;

    iget-object v2, p0, Lce/j2$b;->o:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lce/j2;->o(Lce/j2;Lce/j2$c;Lce/v;Ljava/lang/Object;)V

    return-void
.end method
