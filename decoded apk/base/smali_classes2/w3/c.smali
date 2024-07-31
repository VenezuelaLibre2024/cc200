.class public final synthetic Lw3/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/h;


# instance fields
.field public final synthetic a:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/c;->a:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lw3/c;->a:Ljava/lang/Exception;

    check-cast p1, Lw3/u$a;

    invoke-static {v0, p1}, Lw3/g;->j(Ljava/lang/Exception;Lw3/u$a;)V

    return-void
.end method
