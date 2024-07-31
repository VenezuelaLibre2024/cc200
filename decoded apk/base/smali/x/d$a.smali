.class public Lx/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/d;->i(Landroid/app/Activity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lx/d$d;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx/d$d;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lx/d$a;->h:Lx/d$d;

    iput-object p2, p0, Lx/d$a;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lx/d$a;->h:Lx/d$d;

    iget-object v1, p0, Lx/d$a;->i:Ljava/lang/Object;

    iput-object v1, v0, Lx/d$d;->h:Ljava/lang/Object;

    return-void
.end method
