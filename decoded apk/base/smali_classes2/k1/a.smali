.class public final synthetic Lk1/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv/b$c;


# instance fields
.field public final synthetic a:Lce/x0;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lce/x0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/a;->a:Lce/x0;

    iput-object p2, p0, Lk1/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lv/b$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk1/a;->a:Lce/x0;

    iget-object v1, p0, Lk1/a;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, Lk1/b;->a(Lce/x0;Ljava/lang/Object;Lv/b$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
