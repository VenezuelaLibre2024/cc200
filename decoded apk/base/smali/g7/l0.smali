.class public final Lg7/l0;
.super Lg7/d0;
.source ""


# instance fields
.field public final synthetic h:Lg7/c;


# direct methods
.method public constructor <init>(Lg7/c;)V
    .locals 0

    iput-object p1, p0, Lg7/l0;->h:Lg7/c;

    invoke-direct {p0}, Lg7/d0;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lg7/l0;->h:Lg7/c;

    iget-object v0, v0, Lg7/c;->h:Lg7/d;

    invoke-static {v0}, Lg7/d;->s(Lg7/d;)V

    iget-object v0, p0, Lg7/l0;->h:Lg7/c;

    iget-object v0, v0, Lg7/c;->h:Lg7/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lg7/d;->n(Lg7/d;Landroid/os/IInterface;)V

    iget-object v0, p0, Lg7/l0;->h:Lg7/c;

    iget-object v0, v0, Lg7/c;->h:Lg7/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lg7/d;->m(Lg7/d;Z)V

    return-void
.end method
