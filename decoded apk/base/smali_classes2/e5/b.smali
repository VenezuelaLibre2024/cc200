.class public final synthetic Le5/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic h:Le5/b;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Le5/b;

    invoke-direct {v0}, Le5/b;-><init>()V

    sput-object v0, Le5/b;->h:Le5/b;

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

    check-cast p1, Le5/c$a;

    check-cast p2, Le5/c$a;

    invoke-static {p1, p2}, Le5/c$a;->a(Le5/c$a;Le5/c$a;)I

    move-result p1

    return p1
.end method
