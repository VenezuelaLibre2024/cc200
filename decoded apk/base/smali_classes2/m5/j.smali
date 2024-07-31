.class public final synthetic Lm5/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic h:Lm5/j;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lm5/j;

    invoke-direct {v0}, Lm5/j;-><init>()V

    sput-object v0, Lm5/j;->h:Lm5/j;

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

    check-cast p1, Lm5/e;

    check-cast p2, Lm5/e;

    invoke-static {p1, p2}, Lm5/k;->a(Lm5/e;Lm5/e;)I

    move-result p1

    return p1
.end method
