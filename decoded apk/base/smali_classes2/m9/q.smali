.class public final synthetic Lm9/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/g;


# static fields
.field public static final synthetic a:Lm9/q;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/q;

    invoke-direct {v0}, Lm9/q;-><init>()V

    sput-object v0, Lm9/q;->a:Lm9/q;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly7/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->e(Ly7/d;)Lm9/k;

    move-result-object p1

    return-object p1
.end method
