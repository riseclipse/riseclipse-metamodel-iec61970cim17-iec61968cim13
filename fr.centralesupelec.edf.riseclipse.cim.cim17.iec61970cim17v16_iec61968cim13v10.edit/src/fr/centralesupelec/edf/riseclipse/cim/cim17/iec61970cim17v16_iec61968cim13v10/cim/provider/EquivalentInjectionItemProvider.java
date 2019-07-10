/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentInjection;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentInjection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EquivalentInjectionItemProvider extends EquivalentEquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EquivalentInjectionItemProvider( AdapterFactory adapterFactory ) {
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

            addMaxPPropertyDescriptor( object );
            addMaxQPropertyDescriptor( object );
            addMinPPropertyDescriptor( object );
            addMinQPropertyDescriptor( object );
            addPPropertyDescriptor( object );
            addQPropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addR0PropertyDescriptor( object );
            addR2PropertyDescriptor( object );
            addRegulationCapabilityPropertyDescriptor( object );
            addRegulationStatusPropertyDescriptor( object );
            addRegulationTargetPropertyDescriptor( object );
            addXPropertyDescriptor( object );
            addX0PropertyDescriptor( object );
            addX2PropertyDescriptor( object );
            addReactiveCapabilityCurvePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Max P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_maxP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_maxP_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_MaxP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_maxQ_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_maxQ_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_MaxQ(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_minP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_minP_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_MinP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_minQ_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_minQ_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_MinQ(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_p_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_p_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_P(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_q_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_q_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_Q(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_r_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_R(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_r0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_r0_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_R0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_r2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_r2_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_R2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Regulation Capability feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegulationCapabilityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EquivalentInjection_regulationCapability_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_regulationCapability_feature",
                        "_UI_EquivalentInjection_type" ),
                CimPackage.eINSTANCE.getEquivalentInjection_RegulationCapability(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Regulation Status feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegulationStatusPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_regulationStatus_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_EquivalentInjection_regulationStatus_feature", "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_RegulationStatus(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Regulation Target feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRegulationTargetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_regulationTarget_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_EquivalentInjection_regulationTarget_feature", "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_RegulationTarget(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_x_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_x_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_X(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_x0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_x0_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_X0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EquivalentInjection_x2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EquivalentInjection_x2_feature",
                                "_UI_EquivalentInjection_type" ),
                        CimPackage.eINSTANCE.getEquivalentInjection_X2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reactive Capability Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReactiveCapabilityCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_EquivalentInjection_ReactiveCapabilityCurve_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_EquivalentInjection_ReactiveCapabilityCurve_feature", "_UI_EquivalentInjection_type" ),
                CimPackage.eINSTANCE.getEquivalentInjection_ReactiveCapabilityCurve(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns EquivalentInjection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/EquivalentInjection" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( EquivalentInjection ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_EquivalentInjection_type" )
                : getString( "_UI_EquivalentInjection_type" ) + " " + label;
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

        switch( notification.getFeatureID( EquivalentInjection.class ) ) {
        case CimPackage.EQUIVALENT_INJECTION__MAX_P:
        case CimPackage.EQUIVALENT_INJECTION__MAX_Q:
        case CimPackage.EQUIVALENT_INJECTION__MIN_P:
        case CimPackage.EQUIVALENT_INJECTION__MIN_Q:
        case CimPackage.EQUIVALENT_INJECTION__P:
        case CimPackage.EQUIVALENT_INJECTION__Q:
        case CimPackage.EQUIVALENT_INJECTION__R:
        case CimPackage.EQUIVALENT_INJECTION__R0:
        case CimPackage.EQUIVALENT_INJECTION__R2:
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_CAPABILITY:
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_STATUS:
        case CimPackage.EQUIVALENT_INJECTION__REGULATION_TARGET:
        case CimPackage.EQUIVALENT_INJECTION__X:
        case CimPackage.EQUIVALENT_INJECTION__X0:
        case CimPackage.EQUIVALENT_INJECTION__X2:
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
