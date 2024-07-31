.class public final synthetic Lk0/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/i;


# instance fields
.field public final synthetic h:Lk0/l;

.field public final synthetic i:Lk0/n;


# direct methods
.method public synthetic constructor <init>(Lk0/l;Lk0/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/k;->h:Lk0/l;

    iput-object p2, p0, Lk0/k;->i:Lk0/n;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V
    .locals 2

    iget-object v0, p0, Lk0/k;->h:Lk0/l;

    iget-object v1, p0, Lk0/k;->i:Lk0/n;

    invoke-static {v0, v1, p1, p2}, Lk0/l;->b(Lk0/l;Lk0/n;Landroidx/lifecycle/k;Landroidx/lifecycle/f$a;)V

    return-void
.end method
