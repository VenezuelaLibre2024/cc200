.class public Lh/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lh/k;


# direct methods
.method public constructor <init>(Lh/k;)V
    .locals 0

    iput-object p1, p0, Lh/k$a;->h:Lh/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lh/k$a;->h:Lh/k;

    invoke-virtual {v0}, Lh/k;->C()V

    return-void
.end method
