.class public final Lg6/h0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lg6/k0;


# direct methods
.method public constructor <init>(Lg6/k0;I)V
    .locals 0

    iput-object p1, p0, Lg6/h0;->i:Lg6/k0;

    iput p2, p0, Lg6/h0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg6/h0;->i:Lg6/k0;

    iget v1, p0, Lg6/h0;->h:I

    invoke-static {v0, v1}, Lg6/k0;->A(Lg6/k0;I)V

    return-void
.end method
