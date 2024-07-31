.class public final synthetic Lg9/d1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lg9/e1$a;


# direct methods
.method public synthetic constructor <init>(Lg9/e1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/d1;->h:Lg9/e1$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg9/d1;->h:Lg9/e1$a;

    invoke-static {v0}, Lg9/e1$a;->a(Lg9/e1$a;)V

    return-void
.end method
