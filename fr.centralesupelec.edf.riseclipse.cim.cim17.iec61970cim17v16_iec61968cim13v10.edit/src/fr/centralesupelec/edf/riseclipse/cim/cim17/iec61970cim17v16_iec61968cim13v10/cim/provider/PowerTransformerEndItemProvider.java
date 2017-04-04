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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerTransformerEndItemProvider extends TransformerEndItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerTransformerEndItemProvider( AdapterFactory adapterFactory ) {
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

            addBPropertyDescriptor( object );
            addB0PropertyDescriptor( object );
            addConnectionKindPropertyDescriptor( object );
            addGPropertyDescriptor( object );
            addG0PropertyDescriptor( object );
            addPhaseAngleClockPropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addR0PropertyDescriptor( object );
            addRatedSPropertyDescriptor( object );
            addRatedUPropertyDescriptor( object );
            addXPropertyDescriptor( object );
            addX0PropertyDescriptor( object );
            addPowerTransformerPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the B feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_b_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_b_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_B(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_b0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_b0_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_B0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Connection Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConnectionKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformerEnd_connectionKind_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_connectionKind_feature",
                        "_UI_PowerTransformerEnd_type" ),
                CimPackage.eINSTANCE.getPowerTransformerEnd_ConnectionKind(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the G feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_g_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_g_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_G(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the G0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addG0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_g0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_g0_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_G0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Phase Angle Clock feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhaseAngleClockPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformerEnd_phaseAngleClock_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_phaseAngleClock_feature",
                        "_UI_PowerTransformerEnd_type" ),
                CimPackage.eINSTANCE.getPowerTransformerEnd_PhaseAngleClock(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_r_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_R(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_r0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_r0_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_R0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated S feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedSPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_ratedS_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_ratedS_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_RatedS(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rated U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_ratedU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_ratedU_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_RatedU(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_x_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_x_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_X(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PowerTransformerEnd_x0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_x0_feature",
                                "_UI_PowerTransformerEnd_type" ),
                        CimPackage.eINSTANCE.getPowerTransformerEnd_X0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Power Transformer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerTransformerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformerEnd_PowerTransformer_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformerEnd_PowerTransformer_feature",
                        "_UI_PowerTransformerEnd_type" ),
                CimPackage.eINSTANCE.getPowerTransformerEnd_PowerTransformer(), true, false, true, null, null, null ) );
    }

    /**
     * This returns PowerTransformerEnd.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PowerTransformerEnd" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PowerTransformerEnd ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PowerTransformerEnd_type" )
                : getString( "_UI_PowerTransformerEnd_type" ) + " " + label;
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

        switch( notification.getFeatureID( PowerTransformerEnd.class ) ) {
        case CimPackage.POWER_TRANSFORMER_END__B:
        case CimPackage.POWER_TRANSFORMER_END__B0:
        case CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
        case CimPackage.POWER_TRANSFORMER_END__G:
        case CimPackage.POWER_TRANSFORMER_END__G0:
        case CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK:
        case CimPackage.POWER_TRANSFORMER_END__R:
        case CimPackage.POWER_TRANSFORMER_END__R0:
        case CimPackage.POWER_TRANSFORMER_END__RATED_S:
        case CimPackage.POWER_TRANSFORMER_END__RATED_U:
        case CimPackage.POWER_TRANSFORMER_END__X:
        case CimPackage.POWER_TRANSFORMER_END__X0:
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
