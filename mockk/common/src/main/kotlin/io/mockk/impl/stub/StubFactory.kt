package io.mockk.impl.stub

import kotlin.reflect.KClass

interface StubFactory {

    fun <T : Any> create(cls: KClass<out T>,
                         name: String,
                         gatewayAccess: StubGatewayAccess,
                         recordPrivateCalls: Boolean,
                         mockType: MockType
    ): MockKStub
}