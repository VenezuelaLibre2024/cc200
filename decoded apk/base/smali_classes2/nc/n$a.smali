.class public Lnc/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lnc/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc/n;->d(Lnc/i;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lnc/i;

.field public final synthetic b:Lnc/n;


# direct methods
.method public constructor <init>(Lnc/n;Lnc/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lnc/n$a;->b:Lnc/n;

    iput-object p2, p0, Lnc/n$a;->a:Lnc/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lnc/n$a;->a:Lnc/i;

    iget v0, v0, Lnc/i;->c:I

    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lnc/n$a;->a:Lnc/i;

    invoke-virtual {v0}, Lnc/i;->F()Z

    move-result v0

    return v0
.end method
