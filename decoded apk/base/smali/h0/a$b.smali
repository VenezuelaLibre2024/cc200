.class public Lh0/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh0/a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lh0/g$c;

.field public final synthetic i:I

.field public final synthetic j:Lh0/a;


# direct methods
.method public constructor <init>(Lh0/a;Lh0/g$c;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lh0/a$b;->j:Lh0/a;

    iput-object p2, p0, Lh0/a$b;->h:Lh0/g$c;

    iput p3, p0, Lh0/a$b;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lh0/a$b;->h:Lh0/g$c;

    iget v1, p0, Lh0/a$b;->i:I

    invoke-virtual {v0, v1}, Lh0/g$c;->a(I)V

    return-void
.end method
