.class public abstract Lv0/y$c;
.super Lv0/y;
.source ""

# interfaces
.implements Lv0/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lv0/y$c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lv0/y<",
        "TMessageType;TBuilderType;>;",
        "Lv0/s0;"
    }
.end annotation


# instance fields
.field public extensions:Lv0/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/u<",
            "Lv0/y$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lv0/y;-><init>()V

    invoke-static {}, Lv0/u;->h()Lv0/u;

    move-result-object v0

    iput-object v0, p0, Lv0/y$c;->extensions:Lv0/u;

    return-void
.end method


# virtual methods
.method public L()Lv0/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv0/u<",
            "Lv0/y$d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv0/y$c;->extensions:Lv0/u;

    invoke-virtual {v0}, Lv0/u;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv0/y$c;->extensions:Lv0/u;

    invoke-virtual {v0}, Lv0/u;->b()Lv0/u;

    move-result-object v0

    iput-object v0, p0, Lv0/y$c;->extensions:Lv0/u;

    :cond_0
    iget-object v0, p0, Lv0/y$c;->extensions:Lv0/u;

    return-object v0
.end method

.method public bridge synthetic b()Lv0/r0;
    .locals 1

    invoke-super {p0}, Lv0/y;->z()Lv0/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lv0/r0$a;
    .locals 1

    invoke-super {p0}, Lv0/y;->K()Lv0/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Lv0/r0$a;
    .locals 1

    invoke-super {p0}, Lv0/y;->F()Lv0/y$a;

    move-result-object v0

    return-object v0
.end method
