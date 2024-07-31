.class public final synthetic Le3/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll3/a;


# instance fields
.field public final synthetic a:Le3/d;


# direct methods
.method public synthetic constructor <init>(Le3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/b;->a:Le3/d;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le3/b;->a:Le3/d;

    check-cast p1, Le3/d$a;

    invoke-static {v0, p1}, Le3/d;->d(Le3/d;Le3/d$a;)Le3/d$b;

    move-result-object p1

    return-object p1
.end method
