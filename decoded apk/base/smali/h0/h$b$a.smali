.class public Lh0/h$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh0/h$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lj0/a;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lh0/h$b;


# direct methods
.method public constructor <init>(Lh0/h$b;Lj0/a;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lh0/h$b$a;->j:Lh0/h$b;

    iput-object p2, p0, Lh0/h$b$a;->h:Lj0/a;

    iput-object p3, p0, Lh0/h$b$a;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lh0/h$b$a;->h:Lj0/a;

    iget-object v1, p0, Lh0/h$b$a;->i:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lj0/a;->accept(Ljava/lang/Object;)V

    return-void
.end method
