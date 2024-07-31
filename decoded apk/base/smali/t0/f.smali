.class public final Lt0/f;
.super Lv0/y;
.source ""

# interfaces
.implements Lv0/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/f$a;,
        Lt0/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv0/y<",
        "Lt0/f;",
        "Lt0/f$a;",
        ">;",
        "Lv0/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lt0/f;

.field private static volatile PARSER:Lv0/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/z0<",
            "Lt0/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final PREFERENCES_FIELD_NUMBER:I = 0x1


# instance fields
.field private preferences_:Lv0/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/l0<",
            "Ljava/lang/String;",
            "Lt0/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt0/f;

    invoke-direct {v0}, Lt0/f;-><init>()V

    sput-object v0, Lt0/f;->DEFAULT_INSTANCE:Lt0/f;

    const-class v1, Lt0/f;

    invoke-static {v1, v0}, Lv0/y;->J(Ljava/lang/Class;Lv0/y;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lv0/y;-><init>()V

    invoke-static {}, Lv0/l0;->f()Lv0/l0;

    move-result-object v0

    iput-object v0, p0, Lt0/f;->preferences_:Lv0/l0;

    return-void
.end method

.method public static synthetic L()Lt0/f;
    .locals 1

    sget-object v0, Lt0/f;->DEFAULT_INSTANCE:Lt0/f;

    return-object v0
.end method

.method public static synthetic M(Lt0/f;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p0}, Lt0/f;->N()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static R()Lt0/f$a;
    .locals 1

    sget-object v0, Lt0/f;->DEFAULT_INSTANCE:Lt0/f;

    invoke-virtual {v0}, Lv0/y;->t()Lv0/y$a;

    move-result-object v0

    check-cast v0, Lt0/f$a;

    return-object v0
.end method

.method public static S(Ljava/io/InputStream;)Lt0/f;
    .locals 1

    sget-object v0, Lt0/f;->DEFAULT_INSTANCE:Lt0/f;

    invoke-static {v0, p0}, Lv0/y;->H(Lv0/y;Ljava/io/InputStream;)Lv0/y;

    move-result-object p0

    check-cast p0, Lt0/f;

    return-object p0
.end method


# virtual methods
.method public final N()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lt0/h;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lt0/f;->P()Lv0/l0;

    move-result-object v0

    return-object v0
.end method

.method public O()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lt0/h;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lt0/f;->Q()Lv0/l0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final P()Lv0/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv0/l0<",
            "Ljava/lang/String;",
            "Lt0/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt0/f;->preferences_:Lv0/l0;

    invoke-virtual {v0}, Lv0/l0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lt0/f;->preferences_:Lv0/l0;

    invoke-virtual {v0}, Lv0/l0;->n()Lv0/l0;

    move-result-object v0

    iput-object v0, p0, Lt0/f;->preferences_:Lv0/l0;

    :cond_0
    iget-object v0, p0, Lt0/f;->preferences_:Lv0/l0;

    return-object v0
.end method

.method public final Q()Lv0/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv0/l0<",
            "Ljava/lang/String;",
            "Lt0/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt0/f;->preferences_:Lv0/l0;

    return-object v0
.end method

.method public final w(Lv0/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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
    sget-object p1, Lt0/f;->PARSER:Lv0/z0;

    if-nez p1, :cond_1

    const-class p2, Lt0/f;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lt0/f;->PARSER:Lv0/z0;

    if-nez p1, :cond_0

    new-instance p1, Lv0/y$b;

    sget-object p3, Lt0/f;->DEFAULT_INSTANCE:Lt0/f;

    invoke-direct {p1, p3}, Lv0/y$b;-><init>(Lv0/y;)V

    sput-object p1, Lt0/f;->PARSER:Lv0/z0;

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
    sget-object p1, Lt0/f;->DEFAULT_INSTANCE:Lt0/f;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "preferences_"

    aput-object v0, p1, p3

    sget-object p3, Lt0/f$b;->a:Lv0/k0;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    sget-object p3, Lt0/f;->DEFAULT_INSTANCE:Lt0/f;

    invoke-static {p3, p2, p1}, Lv0/y;->G(Lv0/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lt0/f$a;

    invoke-direct {p1, p3}, Lt0/f$a;-><init>(Lt0/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lt0/f;

    invoke-direct {p1}, Lt0/f;-><init>()V

    return-object p1

    nop

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
