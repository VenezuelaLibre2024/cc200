.class public final Lt0/g;
.super Lv0/y;
.source ""

# interfaces
.implements Lv0/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv0/y<",
        "Lt0/g;",
        "Lt0/g$a;",
        ">;",
        "Lv0/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lt0/g;

.field private static volatile PARSER:Lv0/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/z0<",
            "Lt0/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final STRINGS_FIELD_NUMBER:I = 0x1


# instance fields
.field private strings_:Lv0/a0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/a0$i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt0/g;

    invoke-direct {v0}, Lt0/g;-><init>()V

    sput-object v0, Lt0/g;->DEFAULT_INSTANCE:Lt0/g;

    const-class v1, Lt0/g;

    invoke-static {v1, v0}, Lv0/y;->J(Ljava/lang/Class;Lv0/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lv0/y;-><init>()V

    invoke-static {}, Lv0/y;->x()Lv0/a0$i;

    move-result-object v0

    iput-object v0, p0, Lt0/g;->strings_:Lv0/a0$i;

    return-void
.end method

.method public static synthetic L()Lt0/g;
    .locals 1

    sget-object v0, Lt0/g;->DEFAULT_INSTANCE:Lt0/g;

    return-object v0
.end method

.method public static synthetic M(Lt0/g;Ljava/lang/Iterable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lt0/g;->N(Ljava/lang/Iterable;)V

    return-void
.end method

.method public static P()Lt0/g;
    .locals 1

    sget-object v0, Lt0/g;->DEFAULT_INSTANCE:Lt0/g;

    return-object v0
.end method

.method public static R()Lt0/g$a;
    .locals 1

    sget-object v0, Lt0/g;->DEFAULT_INSTANCE:Lt0/g;

    invoke-virtual {v0}, Lv0/y;->t()Lv0/y$a;

    move-result-object v0

    check-cast v0, Lt0/g$a;

    return-object v0
.end method


# virtual methods
.method public final N(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lt0/g;->O()V

    iget-object v0, p0, Lt0/g;->strings_:Lv0/a0$i;

    invoke-static {p1, v0}, Lv0/a;->d(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public final O()V
    .locals 1

    iget-object v0, p0, Lt0/g;->strings_:Lv0/a0$i;

    invoke-interface {v0}, Lv0/a0$i;->H()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lt0/g;->strings_:Lv0/a0$i;

    invoke-static {v0}, Lv0/y;->D(Lv0/a0$i;)Lv0/a0$i;

    move-result-object v0

    iput-object v0, p0, Lt0/g;->strings_:Lv0/a0$i;

    :cond_0
    return-void
.end method

.method public Q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt0/g;->strings_:Lv0/a0$i;

    return-object v0
.end method

.method public final w(Lv0/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Lt0/e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lt0/g;->PARSER:Lv0/z0;

    if-nez p1, :cond_1

    const-class p2, Lt0/g;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lt0/g;->PARSER:Lv0/z0;

    if-nez p1, :cond_0

    new-instance p1, Lv0/y$b;

    sget-object p3, Lt0/g;->DEFAULT_INSTANCE:Lt0/g;

    invoke-direct {p1, p3}, Lv0/y$b;-><init>(Lv0/y;)V

    sput-object p1, Lt0/g;->PARSER:Lv0/z0;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lt0/g;->DEFAULT_INSTANCE:Lt0/g;

    return-object p1

    :pswitch_4
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "strings_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    sget-object p3, Lt0/g;->DEFAULT_INSTANCE:Lt0/g;

    invoke-static {p3, p2, p1}, Lv0/y;->G(Lv0/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lt0/g$a;

    invoke-direct {p1, p3}, Lt0/g$a;-><init>(Lt0/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lt0/g;

    invoke-direct {p1}, Lt0/g;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
