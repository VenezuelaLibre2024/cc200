.class public final synthetic Lq4/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic h:Lq4/d;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lq4/d;

    invoke-direct {v0}, Lq4/d;-><init>()V

    sput-object v0, Lq4/d;->h:Lq4/d;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lq4/c$b;

    check-cast p2, Lq4/c$b;

    invoke-static {p1, p2}, Lq4/c$b;->a(Lq4/c$b;Lq4/c$b;)I

    move-result p1

    return p1
.end method
