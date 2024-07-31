.class public final synthetic Lm9/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/g;


# static fields
.field public static final synthetic a:Lm9/n;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/n;

    invoke-direct {v0}, Lm9/n;-><init>()V

    sput-object v0, Lm9/n;->a:Lm9/n;

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

    invoke-static {p1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->b(Ly7/d;)Lm9/d0;

    move-result-object p1

    return-object p1
.end method
