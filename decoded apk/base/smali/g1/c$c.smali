.class public Lg1/c$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg1/c;->i(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lg1/c;


# direct methods
.method public constructor <init>(Lg1/c;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lg1/c$c;->i:Lg1/c;

    iput-object p2, p0, Lg1/c$c;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lg1/c$c;->i:Lg1/c;

    iget-object v1, p0, Lg1/c$c;->h:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lg1/c;->d(Ljava/lang/Object;)V

    return-void
.end method
