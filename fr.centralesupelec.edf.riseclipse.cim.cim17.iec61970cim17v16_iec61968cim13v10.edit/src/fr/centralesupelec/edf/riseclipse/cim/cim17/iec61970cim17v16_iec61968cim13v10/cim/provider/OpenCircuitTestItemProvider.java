/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OpenCircuitTest} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenCircuitTestItemProvider extends TransformerTestItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenCircuitTestItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addEnergisedEndStepPropertyDescriptor( object );
            addEnergisedEndVoltagePropertyDescriptor( object );
            addOpenEndStepPropertyDescriptor( object );
            addOpenEndVoltagePropertyDescriptor( object );
            addPhaseShiftPropertyDescriptor( object );
            addOpenEndPropertyDescriptor( object );
            addEnergisedEndPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Energised End Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergisedEndStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_OpenCircuitTest_energisedEndStep_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_OpenCircuitTest_energisedEndStep_feature",
                        "_UI_OpenCircuitTest_type" ),
                CimPackage.eINSTANCE.getOpenCircuitTest_EnergisedEndStep(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Energised End Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergisedEndVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_OpenCircuitTest_energisedEndVoltage_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_OpenCircuitTest_energisedEndVoltage_feature",
                        "_UI_OpenCircuitTest_type" ),
                CimPackage.eINSTANCE.getOpenCircuitTest_EnergisedEndVoltage(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Open End Step feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOpenEndStepPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OpenCircuitTest_openEndStep_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OpenCircuitTest_openEndStep_feature",
                                "_UI_OpenCircuitTest_type" ),
                        CimPackage.eINSTANCE.getOpenCircuitTest_OpenEndStep(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Open End Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOpenEndVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OpenCircuitTest_openEndVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OpenCircuitTest_openEndVoltage_feature",
                                "_UI_OpenCircuitTest_type" ),
                        CimPackage.eINSTANCE.getOpenCircuitTest_OpenEndVoltage(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Phase Shift feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhaseShiftPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OpenCircuitTest_phaseShift_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OpenCircuitTest_phaseShift_feature",
                                "_UI_OpenCircuitTest_type" ),
                        CimPackage.eINSTANCE.getOpenCircuitTest_PhaseShift(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Open End feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOpenEndPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OpenCircuitTest_OpenEnd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OpenCircuitTest_OpenEnd_feature",
                                "_UI_OpenCircuitTest_type" ),
                        CimPackage.eINSTANCE.getOpenCircuitTest_OpenEnd(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Energised End feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergisedEndPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_OpenCircuitTest_EnergisedEnd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_OpenCircuitTest_EnergisedEnd_feature",
                                "_UI_OpenCircuitTest_type" ),
                        CimPackage.eINSTANCE.getOpenCircuitTest_EnergisedEnd(), true, false, true, null, null, null ) );
    }

    /**
     * This returns OpenCircuitTest.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/OpenCircuitTest" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( OpenCircuitTest ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_OpenCircuitTest_type" )
                : getString( "_UI_OpenCircuitTest_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( OpenCircuitTest.class ) ) {
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_STEP:
        case CimPackage.OPEN_CIRCUIT_TEST__ENERGISED_END_VOLTAGE:
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_STEP:
        case CimPackage.OPEN_CIRCUIT_TEST__OPEN_END_VOLTAGE:
        case CimPackage.OPEN_CIRCUIT_TEST__PHASE_SHIFT:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
