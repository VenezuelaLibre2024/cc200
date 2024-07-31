.class public Lpc/g;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lpc/e;

.field public final b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lpc/e;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/g;->a:Lpc/e;

    iput-object p2, p0, Lpc/g;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lpc/g;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
