.class public Lue/k$a;
.super Lbf/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lue/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic k:Lue/k;


# direct methods
.method public constructor <init>(Lue/k;)V
    .locals 0

    iput-object p1, p0, Lue/k$a;->k:Lue/k;

    invoke-direct {p0}, Lbf/a;-><init>()V

    return-void
.end method


# virtual methods
.method public t()V
    .locals 1

    iget-object v0, p0, Lue/k$a;->k:Lue/k;

    invoke-virtual {v0}, Lue/k;->d()V

    return-void
.end method
