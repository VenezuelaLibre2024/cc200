.class public final synthetic Le3/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll3/c;


# static fields
.field public static final synthetic a:Le3/c;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Le3/c;

    invoke-direct {v0}, Le3/c;-><init>()V

    sput-object v0, Le3/c;->a:Le3/c;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le3/d$a;

    check-cast p2, Le3/d$b;

    invoke-static {p1, p2}, Le3/d;->c(Le3/d$a;Le3/d$b;)Le3/d$a;

    move-result-object p1

    return-object p1
.end method
