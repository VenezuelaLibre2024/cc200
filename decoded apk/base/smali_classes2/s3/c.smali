.class public final synthetic Ls3/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ls3/d$a;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ls3/d$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/c;->h:Ls3/d$a;

    iput p2, p0, Ls3/c;->i:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls3/c;->h:Ls3/d$a;

    iget v1, p0, Ls3/c;->i:I

    invoke-static {v0, v1}, Ls3/d$a;->a(Ls3/d$a;I)V

    return-void
.end method
