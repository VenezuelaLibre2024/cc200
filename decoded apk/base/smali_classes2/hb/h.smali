.class public final synthetic Lhb/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lcom/journeyapps/barcodescanner/b$a;

.field public final synthetic i:Lhb/b;


# direct methods
.method public synthetic constructor <init>(Lcom/journeyapps/barcodescanner/b$a;Lhb/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/h;->h:Lcom/journeyapps/barcodescanner/b$a;

    iput-object p2, p0, Lhb/h;->i:Lhb/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lhb/h;->h:Lcom/journeyapps/barcodescanner/b$a;

    iget-object v1, p0, Lhb/h;->i:Lhb/b;

    invoke-static {v0, v1}, Lcom/journeyapps/barcodescanner/b$a;->c(Lcom/journeyapps/barcodescanner/b$a;Lhb/b;)V

    return-void
.end method
